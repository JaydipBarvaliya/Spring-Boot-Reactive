package com.javabrains.reactive;

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
        ReactiveSources.intNumbersFlux()
                .filter(num -> num>5)
                .take(3)
                .map(num-> num*10)
                .subscribe(num -> System.out.println(num));

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
        // TODO: Write code here

        // Switch ints from intNumbersFlux to the right user from userFlux
        // TODO: Write code here

        // Print only distinct numbers from intNumbersFluxWithRepeat
        // TODO: Write code here

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
