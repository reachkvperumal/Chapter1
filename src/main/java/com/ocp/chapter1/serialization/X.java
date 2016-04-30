package com.ocp.chapter1.serialization;

import java.io.Serializable;

/**
 * Created by KV on 4/30/2016.
 */
public class X implements Serializable {
    transient static String transientStaticVar = "transientStaticVar";
    transient final String transientFinalVar = "transientFinalVar";
    transient static final String transientStaticFinalVar = "transientStaticFinalVar";
    transient String transientVar = "transientVar";
}