package com.tutorial.lambda;

import java.util.stream.Stream;

/**
 * Created by KV on 3/23/2017.
 */
public class GenIfImpl {

    private interface FuncIf {
        String strFunc(char[] chArray);
    }

    public static void main(String[] args) {
        GenIf<String> genIf = String[]::new;
        Stream.of(genIf).forEach(t -> {
            System.out.println(t.getClass());
        });

        FuncIf funcIf = String::new;

        String t1 = "A B C D E F G H";
        System.out.println(funcIf.strFunc(t1.toCharArray()));


    }
}
