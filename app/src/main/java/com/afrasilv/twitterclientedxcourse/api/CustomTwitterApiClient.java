package com.afrasilv.twitterclientedxcourse.api;

import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterApiClient;

/**
 * Created by alex on 6/07/16.
 */
public class CustomTwitterApiClient extends TwitterApiClient {
    public CustomTwitterApiClient(Session session) {
        super(session);
    }

    public TimelineService getTimelineService(){
        return getService(TimelineService.class);
    }
}
