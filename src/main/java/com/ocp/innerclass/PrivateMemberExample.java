package com.ocp.innerclass;

public class PrivateMemberExample {

    private String i_m_private = "I am private member, not accessible outside this Class";

    private void privateMethod() {
        System.out.println("Private method of Outer Class");
    }

    class NestedClass extends PrivateMemberExample {
        public void showPrivate() {
            System.out.printf("Accessing Private members of Outer class: %s%n", i_m_private);
            privateMethod();
        } /* * private method trying to be overridden, * instead it’s just hiding parent class method. */

        private void privateMethod() {
            System.out.println("Private method of Nested Class");
        }
    }
    public static void main(String args[]) {
        PrivateMemberExample outerClass = new PrivateMemberExample();
        NestedClass nc = outerClass.new NestedClass();
        nc.showPrivate();
        //shows that private method are accessible in inner class.
        outerClass = nc;
        outerClass.privateMethod();
        /* This will not call private method from inner class,
         which shows you can not override
         private method inside inner class.*/
    }

}
