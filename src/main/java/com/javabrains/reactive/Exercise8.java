package com.javabrains.reactive;

import reactor.core.publisher.Flux;
import reactor.core.publisher.SignalType;

import java.io.IOException;
import java.time.Duration;

public class Exercise8 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFluxWithException()

        // Print values from intNumbersFluxWithException and print a message when error happens


//        ReactiveSources.intNumbersFluxWithException().subscribe(System.out::println,
//                error-> System.out.println("OVERLAP THE ERROR"));

        // Print values from intNumbersFluxWithException and continue on errors
//        ReactiveSources.intNumbersFluxWithException()
//                .onErrorContinue((error, item) -> System.out.println("MANUAL :: " + error.getMessage() + "::VALUE ERROR ::" + item))
//                .subscribe(System.out::println);

        // Print values from intNumbersFluxWithException and when errors
        // happen, replace with a fallback sequence of -1 and -2
//        ReactiveSources.intNumbersFlux()
//                .onErrorResume(err -> Flux.just(-1,-2))
//                .subscribe(System.out::println);



        //use of doFinally :: It will run based on the output of the flux
        ReactiveSources.intNumbersFlux()
                    .onErrorResume(err -> Flux.just(-1,-2))
                    .doFinally(signalType -> {
                        if(signalType == SignalType.ON_COMPLETE){
                            System.out.println("Done................................!!!");
                        }else if(signalType == SignalType.ON_ERROR){
                            System.out.println("Error................................!!!");
                        }
                    })
                    .subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}
