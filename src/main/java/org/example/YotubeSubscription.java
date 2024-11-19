package org.example;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

public class YotubeSubscription implements Subscription {
    public YotubeSubscription(Subscriber<? super String> subscriber, List<String> videos) {
    }

    @Override
    public void request(long l) {

    }

    @Override
    public void cancel() {

    }
}
