package com.javabrains.reactive;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class MyController {


    @GetMapping("/demo")
    public Mono<String> greeting(){



        // We need to block both of the mono to get things workable...
        // return Mono.just(getFirstName().block() + "  " + getLastName().block());

            return getFirstName()
                .zipWith(getLastName())
                .map(mono -> mono.getT1() + mono.getT2());
    }

    private Mono<String> getFirstName(){
        return Mono.just("Dharm ")
                .delayElement(Duration.ofSeconds(5));
    }

    private Mono<String> getLastName(){
        return Mono.just("Kakadiya")
                .delayElement(Duration.ofSeconds(5));
    }



}
