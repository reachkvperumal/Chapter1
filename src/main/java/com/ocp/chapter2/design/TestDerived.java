package com.ocp.chapter2.design;

/**
 * Created by KV on 6/1/2016.
 */
public class TestDerived {

    /**
     * Casting base class to Derived class need explicit casting.
     * Casting Derived class to Base class needn't have explicit casting.
     *
     * @param b
     * @param d1
     */
    public void cast(Base b, Derived d1) {
        Derived d = (Derived) b;
        Base b1 = d1;

    }
}
