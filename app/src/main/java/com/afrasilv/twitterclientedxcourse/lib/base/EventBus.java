package com.afrasilv.twitterclientedxcourse.lib.base;

/**
 * Created by alex on 6/07/16.
 */
public interface EventBus {
    void register(Object subscriber);
    void unregister(Object subscriber);
    void post(Object event);
}
