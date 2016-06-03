package com.ocp.chapter3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by KV on 6/2/2016.
 */
public class Test {

    interface PrintArray {
        void print(String[] arr);
    }


    public static void main(String... args) {
        String[] vals = new String[]{"DHONI", "KV"};
        List<String> list = Arrays.asList(vals);
        list.set(1, "KHOLI");
        vals[0] = "SACHIN";
        String[] vals2 = (String[]) list.toArray();

        Stream.of(vals2).forEach(System.out::println);
        Arrays.stream(vals2).forEach(System.out::println);
        System.out.println("");
        int[] i = {8, 3, 9, 2};
        Arrays.stream(i).forEach(System.out::print);
        System.out.println("");
        Arrays.sort(i);
        Arrays.stream(i).forEach(System.out::print);
        System.out.println("");
        System.out.println(Arrays.binarySearch(i, 8));

        System.out.println(Arrays.binarySearch(i, 40));

        Integer pounds = 15_000;
        System.out.println(pounds);
        int x3 = 5_______2;
        System.out.println(x3);

        String hex = "0x" + Integer.toHexString(x3);
        System.out.println(hex);
        System.out.println(Integer.parseInt(hex.replace("0x", ""), 16));

    }
}
