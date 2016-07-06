package com.afrasilv.twitterclientedxcourse;

import android.app.Application;

import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.*;

import io.fabric.sdk.android.Fabric;

/**
 * Created by alex on 6/07/16.
 */
public class TwitterClientApp extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        initFabric();
    }

    private void initFabric() {
        TwitterAuthConfig authConfig = new TwitterAuthConfig(BuildConfig.TWITTER_KEY,
                BuildConfig.TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
    }
}
