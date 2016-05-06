package com.ocp.chapter1.inner;

/**
 * Created by KV on 5/5/2016.
 */
public class Book {
    private int pageNumber;

    private class BookReader {
        public int getPage() {
            return pageNumber;
        }
    }

    public static void main(String... args) {
        Book.BookReader inner = new Book().new BookReader();
        System.out.println(inner.getPage());
    }
}
