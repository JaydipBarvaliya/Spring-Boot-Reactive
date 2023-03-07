package com.javabrains.reactive;

import reactor.core.publisher.Mono;

import java.io.IOException;
import java.util.List;

public class Exercise9 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Print size of intNumbersFlux after the last item returns
        // we can collect data into the stream and then convert into the List
        // And then we find the size of the list...but that would be blocking mode.
        // Count will do the same thing in non-blocking way, but it will take time till
        // Stream will complete it's work.
//        ReactiveSources.intNumbersFlux().count().subscribe(System.out::println);

        // Collect all items of intNumbersFlux into a single list and print it
//        List<Integer> list = ReactiveSources.intNumbersFlux().toStream().toList();
//        System.out.println(list);

//        ReactiveSources.intNumbersFlux().collectList().subscribe(System.out::println);



        // Transform to a sequence of sums of adjacent two numbers
        ReactiveSources.intNumbersFlux()
                .buffer(2)
                .map(list -> list.get(0) + list.get(1))
                .subscribe(System.out::println);




        System.out.println("Press a key to end");
        System.in.read();
    }

}
