package com.tutorial.util;

import java.util.Arrays;

public class Search {

    public static void main(String[] args) {
        int i[] = {2,6,8,9};
        Arrays.sort(i);
        System.out.println(Arrays.binarySearch(i, 6)); //1
        System.out.println(Arrays.binarySearch(i, 1)); //-1
        System.out.println(Arrays.binarySearch(i, 17)); //-5
    }
}
