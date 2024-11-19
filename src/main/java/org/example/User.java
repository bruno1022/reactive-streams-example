package org.example;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;


public class User implements Subscriber<String>{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Subscription subscription) {

    }

    @Override
    public void onNext(String s) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
