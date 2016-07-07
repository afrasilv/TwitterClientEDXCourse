package com.afrasilv.twitterclientedxcourse.images.ui;

import com.afrasilv.twitterclientedxcourse.entities.Image;

import java.util.List;

/**
 * Created by Alejandro Franco on 7/07/16.
 */
public interface ImagesView {
    void showImages();
    void hideImages();
    void showProgress();
    void hideProgress();

    void onError(String error);
    void setContent(List<Image> items);
}
