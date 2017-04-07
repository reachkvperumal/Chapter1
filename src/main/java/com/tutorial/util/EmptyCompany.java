package com.tutorial.util;

/**
 * Created by KV on 4/6/2017.
 */
public class EmptyCompany extends Exception {

    public EmptyCompany() {
    }

    public EmptyCompany(String message) {
        super(message);
    }

    public EmptyCompany(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyCompany(Throwable cause) {
        super(cause);
    }

    public EmptyCompany(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
