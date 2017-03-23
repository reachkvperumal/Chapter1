package com.tutorial.regex;

import java.util.regex.Pattern;

/**
 * Created by KV on 3/22/2017.
 */
public class PhoneNumberValidation {

    static void validate() {
        String phone = "4550001234";
        String regex = "^((2[0-9][0-9]|3[0-9][0-9]|4[0-9][0-9]|5[0-9][0-9]|6[0-9][0-9]|7[0-9][0-9]|8[0-9][0-9]|9[0-9][0-8])[0-9][0-9][0-9][0-9][0-9][0-9][0-9]){0,10}$";
        System.out.println(Pattern.compile(regex).matcher(phone).matches());
    }

    public static void main(String[] args) {
        validate();
    }
}
