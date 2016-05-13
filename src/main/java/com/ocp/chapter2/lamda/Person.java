package com.ocp.chapter2.lamda;

import java.io.Serializable;

/**
 * Created by KV on 5/12/2016.
 */
public class Person implements Serializable {

    private static final long serialVersionUID = 6663135360658142869L;

    private final String firstName;

    private final String lastName;

    private final Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
}
