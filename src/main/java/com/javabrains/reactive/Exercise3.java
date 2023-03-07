package com.javabrains.reactive;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size


        //This is where we are waiting for flux stream to collect all the data
        //Once data is collected then we move forward which means we are explicitly blocking the flow...
        //One way we can say that... it is not async anymore...
        List<Integer> list = ReactiveSources.intNumbersFlux().log().toStream().toList();

        System.out.println(list);
        System.out.println("SIZE " + list.size());


//        We do not need this explicit blocking...because we are blocking the flow while collecting the data...
//        System.out.println("Press a key to end");
//        System.in.read();

    }

}
