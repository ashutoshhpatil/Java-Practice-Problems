package Innerclass;

class A{
    class B{
        class C{
            void m1(){
                System.out.println("Innermost Method of C Inner Class");
            }
        }
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {

        A.B.C obj = new A().new B(). new C();
        obj.m1();   //  Normal Object Creation of 3 Inner classes

        new A().new B().new C().m1();    // Object Chaining
    }
}
