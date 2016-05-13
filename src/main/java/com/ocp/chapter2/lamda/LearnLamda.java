package com.ocp.chapter2.lamda;

import java.util.function.Predicate;

/**
 * Created by KV on 5/12/2016.
 */
public class LearnLamda {

    private static Integer getAge(Person person, Predicate<Person> p) {
        if (p.test(person)) {
            return person.getAge();
        }
        return getAge(person, p.negate());
    }

    public static void main(String... str) {
        Person p = new Person("KV", "Perumal", 35);

        for (int i = 36; i > 30; i--) {
            int j = i;
            System.out.println(getAge(p, a -> a.getAge() < j));
        }


    }

}
