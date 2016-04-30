package com.ocp.chapter1.serialization.initializers;

import java.io.Serializable;

/**
 * Created by KV on 4/30/2016.
 */
public class X implements Serializable {
    transient static String transientStaticVar;
    transient final String transientFinalVar;
    transient static final String transientStaticFinalVar;
    transient String transientVar = "transientVar";

    static {
        transientStaticVar = "transientStaticVar";
        transientStaticFinalVar = "transientStaticFinalVar";
    }

    {
        transientFinalVar = "transientFinalVar";
    }

}
