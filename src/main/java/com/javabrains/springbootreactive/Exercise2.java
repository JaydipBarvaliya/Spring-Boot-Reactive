package com.javabrains.reactive;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Print all numbers in the ReactiveSources.intNumbersFlux stream

//        ReactiveSources.intNumbersFlux().subscribe(event -> System.out.println(event));
//        ReactiveSources.intNumbersFlux().subscribe(event -> System.out.println("ANOTHER THREAD :: " + event));

        // Print all users in the ReactiveSources.userFlux stream






        //ASYNC.....NON-BLOCK
        ReactiveSources.userFlux().subscribe(event -> System.out.println(event));


        System.out.println("IN THE END......");

        System.out.println("Press a key to end");
        System.in.read();
    }

}
