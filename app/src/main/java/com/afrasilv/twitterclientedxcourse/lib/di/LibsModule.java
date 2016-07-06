package com.afrasilv.twitterclientedxcourse.lib.di;

import android.app.Fragment;

import com.afrasilv.twitterclientedxcourse.lib.GlideImageLoader;
import com.afrasilv.twitterclientedxcourse.lib.GreenRobotEventBus;
import com.afrasilv.twitterclientedxcourse.lib.base.EventBus;
import com.afrasilv.twitterclientedxcourse.lib.base.ImageLoader;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Alejandro Franco on 6/07/16.
 */
@Module
public class LibsModule {
    private Fragment fragment;

    public LibsModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @Singleton
    ImageLoader providesImageLoader(RequestManager requestManager){
        return new GlideImageLoader(requestManager);
    }

    @Provides
    @Singleton
    RequestManager providesRequestManager(Fragment fragment){
        return Glide.with(fragment);
    }

    @Provides
    @Singleton
    Fragment providesFragment(){
        return this.fragment;
    }


    @Provides
    @Singleton
    EventBus providesEventBus(org.greenrobot.eventbus.EventBus eventBus){
        return new GreenRobotEventBus(eventBus);
    }

    @Provides
    @Singleton
    org.greenrobot.eventbus.EventBus providesLibraryEventBus(){
        return org.greenrobot.eventbus.EventBus.getDefault();
    }
}
