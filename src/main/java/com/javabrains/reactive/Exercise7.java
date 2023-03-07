package com.javabrains.reactive;

import reactor.core.Disposable;
import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
//         ReactiveSources.intNumbersFlux()
//                 .filter(e -> e > 5)
//                 .log()
//                 .subscribe(event -> System.out.println(event));

        // Print 10 times each value from intNumbersFlux that's greater than 5
//         ReactiveSources.intNumbersFlux()
//                         .filter(e -> e > 5)
//                         .map(e -> e * 10)
//                         .log()
//                         .subscribe(event -> System.out.println(event));

        // Print 10 times each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
//        ReactiveSources.intNumbersFlux()
//                .filter(num -> num>5)
//                .take(3)
//                .map(num-> num*10)
//                .subscribe(num -> System.out.println(num));

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
//        Disposable subscribe = ReactiveSources.intNumbersFlux()
//                .filter(num -> num > 20)
//                .defaultIfEmpty(-1)
//                .subscribe(System.out::println);


        // Switch ints from intNumbersFlux to the right user from userFlux
//        ReactiveSources.intNumbersFlux()
//                .flatMap(num -> ReactiveSources.userFlux().filter(user-> user.getId() == num))
//                .subscribe(System.out::println);


        // Print only distinct numbers from intNumbersFluxWithRepeat
        // ReactiveSources.intNumbersFluxWithRepeat().distinct().subscribe(System.out::println);

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
//        ReactiveSources.intNumbersFluxWithRepeat().distinctUntilChanged().subscribe(System.out::println);




        //Practice
        ReactiveSources
                .intNumbersFlux()
                .map(num -> ReactiveSources.multiply(num))
                .subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
