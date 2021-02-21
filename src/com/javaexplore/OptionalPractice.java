package com.javaexplore;

import java.util.Optional;

public class OptionalPractice {


    public static void main(String[] args) {
        Optional<String> opString = Optional.of("Sample Optional string");
        opString = Optional.ofNullable(null);
//        opString = null;

        opString.ifPresent(string -> {
            System.out.println(string);
            System.out.println("Executed");
        });
    }
}
