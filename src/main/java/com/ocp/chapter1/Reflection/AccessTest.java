package com.ocp.chapter1.Reflection;

import com.ocp.chapter1.overloading.Base;
import com.ocp.chapter1.overloading.Derived;

/**
 * Created by KV on 5/3/2016.
 */
public class AccessTest extends Derived {

    @Override
    protected int method(Base a) {
        return super.method(a);
    }


}
