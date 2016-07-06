package com.afrasilv.twitterclientedxcourse.lib;

import android.widget.ImageView;

import com.afrasilv.twitterclientedxcourse.lib.base.ImageLoader;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by alex on 6/07/16.
 */
public class GlideImageLoader implements ImageLoader {
    private RequestManager glideRequestManager;

    public GlideImageLoader(RequestManager glideRequestManager) {
        this.glideRequestManager = glideRequestManager;
    }

    @Override
    public void load(ImageView imageView, String URL) {
        glideRequestManager
                .load(URL)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .override(600, 400)
                .into(imageView);
    }
}
