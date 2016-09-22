package com.office;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by KV on 9/21/2016.
 */
public class RegExpEval {

    private static boolean ssnValidation(String s) {
        //((\d)\1* )
        String pattern = "^((^000)|([0-7][0-7][0-2])|(8?[0-9][0-9]))$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        System.out.println(m.groupCount());

        return Pattern.compile("^((^000)|([0-7][0-7][0-2])|(8?[0-9][0-9]))$").matcher(s).matches();
    }

    private static boolean tinValidation(String s) {
        String pattern = "((?=9)\\d{3}(?:[7-8][0-8]|9[[0-2]|[4-9]])\\d{4})";
        //((?=9)\d{9})
        //((?<=9)\d{9})
        //((?=9)\d{3}([7-8][0-8] | 9[[0-2] | [4-9]]\\d{4}))

        return Pattern.compile(pattern).matcher(s).matches();
    }

    public static void main(String[] args) {
        System.out.println(ssnValidation("071"));
        System.out.println(ssnValidation("900"));
        System.out.println(ssnValidation("000"));

        System.out.println(tinValidation("9999999"));
    }
}
