package com.tutorial.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DivideList {

    private static <T> Collection<List<T>> partition(List<T> stringList, int size) {
        final AtomicInteger counter = new AtomicInteger(0);
        return stringList.stream().collect(Collectors.groupingBy(obj -> counter.getAndIncrement() / size))
                .values();
    }

    private static void show(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {

        String alpha[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        List<String> list = Arrays.asList(alpha);

        Collection<List<String>> partition = partition(list, 7);

        List<Stream<String>> collect = partition.stream().map(o -> {
            return o.stream().map(o1 -> o1.toLowerCase());
        }).collect(Collectors.toList());



        System.out.println(partition.size());
        System.out.println(collect);
    }
}
