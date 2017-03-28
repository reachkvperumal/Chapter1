package com.tutorial.regex;

import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by KV on 3/22/2017.
 */
public class PhoneNumberValidation {

    static void validate() {
        // String[] phone = {"2014567890","2004567890","9984567990", "", "20145678901", "2014", "1234567890", "20145678902014567802014567890"};
        String[] phone = {""};
        String regex = "^((2[0-9][0-9]|3[0-9][0-9]|4[0-9][0-9]|5[0-9][0-9]|6[0-9][0-9]|7[0-9][0-9]|8[0-9][0-9]|9[0-9][0-8])[0-9][0-9][0-9][0-9][0-9][0-9][0-9]){1}$";
        Stream.of(phone).forEach(t -> System.out.println(Pattern.compile(regex).matcher(t).matches()));

    }

    public static void main(String[] args) {
        validate();

        int[] counter = new int[1];
        System.out.println(counter[0]);
        System.out.println('\u0000');
    }
}
