package com.javabrains.reactive;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

//         Use ReactiveSources.intNumberMono()
//         Print the value from intNumberMono when it emits
//         ReactiveSources.intNumberMono().subscribe(System.out::println);


//        Get the value from the Mono into an integer variable
//        Blocking mono
//        Integer monoNumber = ReactiveSources.intNumberMono().block();
//        System.out.println(monoNumber);

        User user = ReactiveSources.userMono().block();

        System.out.println(user);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
