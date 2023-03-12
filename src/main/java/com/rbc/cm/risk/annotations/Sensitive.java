package com.rbc.cm.risk.annotations;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Inherited
@Retention(RUNTIME)
@Target(METHOD)
public @interface Sensitive {
    String[] roles();
    String hash() default "#";
}
