package com.ocp.chapter3.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by KV on 6/8/2016.
 */
public class TestGenerics {

    private void test() {
        // Scenario - 1
        List<?> list1 = new ArrayList<A>();
        list1.add(null);

        // Scenario - 2
        List<? extends A> list2 = new ArrayList<A>();
        list2.add(null);

        B b = (B) list2.get(0);
        C c = (C) list2.get(0);
        if (Objects.isNull(b)) {
            System.out.println("OBJECT B ? extends A IS NULL");
        }
        if (Objects.isNull(c)) {
            System.out.println("OBJECT C ? extends A IS NULL");
        }

        // Scenario - 3
        List<? super A> list3 = new ArrayList<A>();

        list3.add(new A());
        list3.add(new B());
        list3.add(new C());
        this.print(list3);

        // Scenario - 4
        List<? extends B> list4 = new ArrayList<C>(); // you can't reference A in ArrayList
        list4.add(null);
        b = (B) list4.get(0);
        c = (C) list4.get(0);

        if (Objects.isNull(b)) {
            System.out.println("OBJECT B ? extends B IS NULL");
        }
        if (Objects.isNull(c)) {
            System.out.println("OBJECT C ? extends B IS NULL");
        }

        //Scenario - 5
        List<? super B> list5 = new ArrayList<A>();
        list5.add(new B());
        list5.add(new C());
        this.print(list5);

        //Scenario - 6
        List<?> list6 = new ArrayList<>(); // ArrayList type can't be ? extends A

        List<A> aList = new ArrayList<>();
        aList.add(new A());
        this.method4(aList);

        List<Object> strings = new ArrayList<>();
        strings.add("KV");
        this.method4(strings);
    }

    void method4(List<? super B> list) {
        System.out.println("---METHOD-4---");
        list.forEach(System.out::println);
    }

    private <T> void print(List<?> list) {
        System.out.println("---PRINT---");
        list.forEach(System.out::println);
    }

    private B method3(List<B> list) {
        return new B();
    }


    //in place of ? you can't have any other character
    void method5(List<? super B> list) {

    }

    public static void main(String... args) {
        TestGenerics obj = new TestGenerics();
        obj.test();
        List<B> list = new ArrayList<>();
        list.add(new B());
        System.out.println(obj.method3(list));

    }
}
