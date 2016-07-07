package com.afrasilv.twitterclientedxcourse.images;

import com.afrasilv.twitterclientedxcourse.images.events.ImagesEvent;

/**
 * Created by Alejandro Franco on 7/07/16.
 */
public interface ImagesPresenter {
    void onResume();
    void onPause();
    void onDestroy();
    void getImageTweets();
    void onEventMainThread(ImagesEvent event);
}
