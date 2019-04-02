package com.interview;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxLenEvenWord {

    //Find the first maximum length even word from a string

    private static Optional<Integer> getMaxLenEven(String search){
        return Arrays
                .stream(search.split("\\s"))
                .filter(o -> o.length() % 2 == 0)
                .map(String::length)
                .collect(Collectors.maxBy(Integer::compareTo));
    }

    public static void main(String[] args) {
        Optional<Integer> lenEven = getMaxLenEven("this is a test string");
        lenEven.ifPresent(System.out::println);
    }
}
