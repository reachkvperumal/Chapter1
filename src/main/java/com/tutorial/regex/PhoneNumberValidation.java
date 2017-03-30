package com.tutorial.regex;

import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by KV on 3/22/2017.
 */
public class PhoneNumberValidation {

    static void validate() {
        // String[] phone = {"2014567890","2004567890","9984567990", "", "20145678901", "2014", "1234567890", "20145678902014567802014567890"};
        String[] phone = {"2123433712"};
        String regex = "^(((2[0-9][0-1]|2[0-9][3-9]|2[0-1][0-9]|2[3-9][0-9]|3[0-9][0-9]|4[0-9][0-9]|5[0-9][0-9]|6[0-9][0-9]|7[0-9][0-9]|8[0-9][0-9]|9[0-9][0-8]))" +
                "[0-9][0-9][0-9][0-9][0-9][0-9][0-9])$";
        Stream.of(phone).forEach(t -> System.out.println(Pattern.compile(regex).matcher(t).matches()));

        String regxp1 = "(?i)(?:([\\d])(?!\\1+))*";
        System.out.println(Pattern.compile(regxp1).matcher("515").matches());
    }

    public static void main(String[] args) {
        validate();
    }
}
