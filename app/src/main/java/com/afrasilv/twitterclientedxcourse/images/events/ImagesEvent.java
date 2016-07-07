package com.afrasilv.twitterclientedxcourse.images.events;

import com.afrasilv.twitterclientedxcourse.entities.Image;

import java.util.List;

/**
 * Created by Alejandro Franco on 7/07/16.
 */
public class ImagesEvent {
    private String error;
    private List<Image> images;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
