package com.afrasilv.twitterclientedxcourse.images;

/**
 * Created by Alejandro Franco on 7/07/16.
 */
public class ImagesInteractorImpl implements ImagesInteractor {
    private ImagesRepository repository;

    public ImagesInteractorImpl(ImagesRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        repository.getImages();
    }
}
