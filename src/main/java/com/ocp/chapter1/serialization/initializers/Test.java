package com.ocp.chapter1.serialization.initializers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by KV on 4/30/2016.
 */
public class Test {
    public static void main(String[] args) {
        try {
            ObjectOutputStream o = new ObjectOutputStream(
                    new FileOutputStream("logInfo.out"));
            Y a = new Y("KV");
            System.out.println("Before Serialization ...");
            System.out.println("transientStaticVar = " + X.transientStaticVar);
            System.out.println("transientFinalVar = " + a.transientFinalVar);
            System.out.println("transientStaticFinalVar = " +
                    X.transientStaticFinalVar);
            System.out.println("transientVar = " + a.transientVar);
            o.writeObject(a);
            o.close();
            X.transientStaticVar = "newTransientStaticVar";
        } catch (Exception e) {
            //deal with exception
        }

        try {

            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream("logInfo.out"));
            Y x = (Y) in.readObject();
            System.out.println("After Serialization ...");
            System.out.println("transientStaticVar = " + X.transientStaticVar);
            System.out.println("transientFinalVar = " + x.transientFinalVar);
            System.out.println("transientStaticFinalVar = " +
                    X.transientStaticFinalVar);
            System.out.println("transientVar = " + x.transientVar);
            System.out.println("name = " + x.getName());
        } catch (Exception e) {
            //deal with exception
        }

    }

}
