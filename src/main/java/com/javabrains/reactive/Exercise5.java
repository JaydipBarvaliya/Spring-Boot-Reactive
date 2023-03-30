package com.javabrains.reactive;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class Exercise5 {

    public static void main(String[] args) throws IOException {

//         Use ReactiveSources.intNumberFlux() and ReactiveSources.userMono()

//         Subscribe to a flux using the error and completion hooks
//        ReactiveSources.intNumbersFlux().subscribe(event -> System.out.println(event),
//                                                   err -> System.out.println(err.getMessage()),
//                                                    () -> System.out.println("COMPLETING...")
//                                                    );



        // Subscribe to a flux using an implementation of BaseSubscriber
        ReactiveSources.intNumbersFlux().subscribe(new MySubscriber<>());

        System.out.println("Press a key to end");
        System.in.read();
    }
}

class MySubscriber<T> extends BaseSubscriber<T> {

    public void hookOnSubscribe(Subscription subscription){
        System.out.println("Subscription happened...");
        request(1);
    }
    public void hookOnNext(T value){
        System.out.println(value.toString() + " Received");
        request(5);
    }
}