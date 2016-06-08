package com.ocp.chapter3.generics;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KV on 6/7/2016.
 */
public class Tutorial {

    private static void test() {
        List<String> lists = new ArrayList<>();
        lists.add("TEST");
        lists.add("KV");
        print(lists);

        List<Object> types = new ArrayList<>();
        types.add("DUMMY");
        show(types);

        List<? super IOException> objects = new ArrayList<>();
        objects.add(new IOException("IO_EXCEPTION"));
        objects.add(new EOFException("EOF_EXCEPTION"));
        objects.add(new FileNotFoundException("FOF_EXCEPTION"));
        objects.add(new MalformedURLException("MAL_URL_EXCEPTION"));
        objects.add(new UnknownHostException("UNKNOWN_HOST_EXCEPTION"));

        showException((List<IOException>) objects);

    }

    private static void showException(List<IOException> exceptions) {
        exceptions.stream().forEach(ex -> System.out.println(ex.getMessage()));
    }

    private static void print(List<?> list) {
        list.forEach(System.out::println);
    }

    private static void show(List<? super String> list) {
        list.forEach(System.out::println);
    }

    public static void main(String... args) {
        test();
    }
}
