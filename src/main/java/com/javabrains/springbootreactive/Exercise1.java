package com.javabrains.reactive;

public class Exercise1 {

    public static void main(String[] args) {






        // Use StreamSources.intNumbersStream() and StreamSources.userStream()


        // Print all numbers in the intNumbersStream stream
//        StreamSources.intNumbersStream().forEach(num -> System.out.println(num));

        // Print numbers from intNumbersStream that are less than 5
//        StreamSources.intNumbersStream().filter(num -> num<5).forEach(System.out::println);


        // Print the second and third numbers in intNumbersStream that's greater than 5
//        StreamSources.intNumbersStream()
//                .filter(num -> num>5)
//                .skip(1)
//                .limit(2)
//                .forEach(System.out::println);



        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1

//        int value = StreamSources.intNumbersStream()
//                .filter(num -> num>5)
//                .findFirst()
//                .orElse(-1);
//        System.out.println(value);


        // Print first names of all users in userStream

//        StreamSources
//                .userStream()
//                .map(user -> user.getFirstName())
//                .forEach(System.out::println);




        // Print first names in userStream for users that have IDs from number stream

//        StreamSources.intNumbersStream()
//                .flatMap( numId -> StreamSources.userStream()
//                        .filter(user -> user.getId() == numId))
//                .forEach(user -> System.out.println(user));


        //Precise way of above approach
//        StreamSources.userStream()
//                .filter(user -> StreamSources.intNumbersStream().anyMatch(intID-> intID == user.getId()))
//                .forEach(System.out::println);


    }
}
