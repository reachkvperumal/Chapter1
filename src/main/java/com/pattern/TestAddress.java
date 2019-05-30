package com.pattern;

public class TestAddress {

    public static void main(String[] args) {
        Address engine = Address.builder().url("www.google.com").port(80).protocol("SSL").description("Search Engine").path("http://www.google.com").build();
        System.out.println(engine);
    }
}
