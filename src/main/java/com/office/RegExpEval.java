package com.office;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * Created by KV on 9/21/2016.
 */
public class RegExpEval {

    private static boolean ssnValidation(String s) {
        //((\d)\1* )
        String pattern = "^((^000)|([0-7][0-7][0-2])|(8?[0-9][0-9]))$";
        Pattern p = compile(pattern);
        Matcher m = p.matcher(s);
        System.out.println(m.groupCount());

        return compile("^((^000)|([0-7][0-7][0-2])|(8?[0-9][0-9]))$").matcher(s).matches();
    }

    private static boolean tinValidation(String s) {
        String pattern = "((?=9)\\d{3}(?:[7-8][0-8]|9[[0-2]|[4-9]])\\d{4})";
        //((?=9)\d{9})
        //((?<=9)\d{9})
        //((?=9)\d{3}([7-8][0-8] | 9[[0-2] | [4-9]]\\d{4}))

        return compile(pattern).matcher(s).matches();
    }

    private static boolean running(String s) {
        return compile("^(\\d)(?!\\1+$)\\d*$").matcher(s).matches();
    }

    private static boolean validation(String s) {
        return compile("^(?!123456789|987654321)\\d{9}$").matcher(s).matches();
    }
    public static void main(String[] args) {
        /*System.out.println(ssnValidation("071"));
        System.out.println(ssnValidation("900"));
        System.out.println(ssnValidation("000"));

        System.out.println(tinValidation("9999999"));*/
        System.out.println(validation("369258147"));
        System.out.println(running("000000000"));
        System.out.println(running("183841601"));
    }
}
