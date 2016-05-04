package com.ocp.chapter1.serialization.detail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Objects;

/**
 * Created by KV on 4/30/2016.
 */
public class Diplodocus implements Serializable {

    private final transient Logger LOG = LoggerFactory.getLogger(Diplodocus
            .class);

    private final transient String s1 = "test";
    private final transient String s2;
    private final transient String s3 = new String("hello");
    private final transient String s4 = s1 + s1 + 1;
    private final transient String s5;
    private final transient int i1 = 7;
    private final transient int i2 = 7 * 3;
    private final transient int i3 = Integer.MIN_VALUE;
    private final transient int[] a1 = {1, 2, 3};

    public Diplodocus() {
        System.out.println("CONSTRUCTOR");
        s2 = "s2";
    }

    {
        System.out.println("INSTANCE INITIALIZER");
        s5 = "JAVA";
    }


    public static void main(String[] args) {

        File f = new File("diplo");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Diplodocus());
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Diplodocus diplo = (Diplodocus) ois.readObject();
            ois.close();
            System.out.println("s1 = " + diplo.s1);
            System.out.println("s2 = " + diplo.s2);
            System.out.println("s3 = " + diplo.s3);
            System.out.println("s4 = " + diplo.s4);
            System.out.println("s5 = " + diplo.s5);
            System.out.println("i1 = " + diplo.i1);
            System.out.println("i2 = " + diplo.i2);
            System.out.println("i3 = " + diplo.i3);
            System.out.println("a1 = " + diplo.a1);
            System.out.println("is LOG NULL = " + Objects.isNull(diplo.LOG));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}