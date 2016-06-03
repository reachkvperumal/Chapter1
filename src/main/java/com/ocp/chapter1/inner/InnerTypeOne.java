package com.ocp.chapter1.inner;

/**
 * Created by KV on 5/5/2016.
 */
public class InnerTypeOne {

    private String name = "OUTER CLASS";

    private interface Example {
        String example = "FROM INTERFACE";

        void show();
    }

    private void getExample() {
        new Example() {
            private String t1 = "t1";
            @Override
            public void show() {
                System.out.println(name);
            }
        }.show();
    }

    private final class InnerTypeTwo implements Example {
        private String name = "T1";

        private InnerTypeTwo(String name) {
            System.out.println("INNER CLASS CONSTRUCTOR");
            this.name = name;
        }

        @Override
        public void show() {
            System.out.printf("OUTER CLASS NAME = %s, INNER CLASS NAME = %s, From Interface value = %s%n", InnerTypeOne.this.name, this.name, this.example);
        }
    }

    private void localClass(String name) {

        String test = "LOCAL CLASS TEST";
        class LocalClass implements Example {

            @Override
            public void show() {
                System.out.printf("OUTER CLASS NAME = %s, INNER CLASS NAME = %s, From Interface value = %s, local method %s%n", name, InnerTypeOne.this.name, this.example, test);
            }
        }

        Example obj = new LocalClass();
        obj.show();


        return;
    }

    public static void main(String... args) {
        InnerTypeOne obj = new InnerTypeOne();
        InnerTypeTwo inner = obj.new InnerTypeTwo("INNER CLASS");
        inner.show();
        obj.localClass("LOCAL CLASS");

        obj.getExample();
    }

}
