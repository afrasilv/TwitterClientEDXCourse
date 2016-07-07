package com.afrasilv.twitterclientedxcourse.images;

import com.afrasilv.twitterclientedxcourse.images.ImagesInteractor;
import com.afrasilv.twitterclientedxcourse.images.ImagesPresenter;
import com.afrasilv.twitterclientedxcourse.images.events.ImagesEvent;
import com.afrasilv.twitterclientedxcourse.images.ui.ImagesView;
import com.afrasilv.twitterclientedxcourse.lib.base.EventBus;

/**
 * Created by Alejandro Franco on 7/07/16.
 */
public class ImagesPresenterImpl implements ImagesPresenter {
    private EventBus eventBus;
    private ImagesView view;
    private ImagesInteractor interactor;

    public ImagesPresenterImpl(EventBus eventBus, ImagesView view, ImagesInteractor interactor) {
        this.eventBus = eventBus;
        this.view = view;
        this.interactor = interactor;
    }

    @Override
    public void onResume() {
        eventBus.register(this);
    }

    @Override
    public void onPause() {
        eventBus.unregister(this);
    }

    @Override
    public void onDestroy() {
        view = null;
    }

    @Override
    public void getImageTweets() {
        if(view != null){
            view.hideImages();
            view.showProgress();
        }
        interactor.execute();
    }

    @Override
    public void onEventMainThread(ImagesEvent event) {
        String errorMsg = event.getError();
        if(view != null) {
            view.showImages();
            view.hideProgress();
            if (errorMsg != null){
                view.onError(errorMsg);
            } else {
                view.setContent(event.getImages());
            }
        }
    }
}
