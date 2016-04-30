package com.ocp.chapter1.overloading;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by KV on 4/13/2016.
 */
public class Employee {

    public void printSalary(int salary) {
        System.out.println("Salary without bonus : " + salary);

    }

    public void printSalary(int salary, double bonus) {
        System.out.println("Salary with bonus : " + (salary + bonus));

    }

    public void printSalary(double bonus, int salary) {
        System.out.println("Salary with bonus : " + (salary + bonus));
    }

    private String show() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("KV", "KV");
        map.put("ANUSHA", "ANUSHA");

        String result = map.get("AVYUKT");
        return result == null ? "AVYUKT" : result;


    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.printSalary(10);
        obj.printSalary(10, 12d);
        obj.printSalary(13d, 10);
        System.out.println(System.getProperty("java.version"));
        System.out.println(obj.show());
    }
}


