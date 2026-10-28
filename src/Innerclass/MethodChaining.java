package Innerclass;

public class MethodChaining {
    class Inner{
        void m2(){
            System.out.println("Method of MethodChainingDemo Inner Class");
        }
    }

    void m1(){
        System.out.println("Method of MethodChainingDemo Outer Class");

        Inner inner = new Inner();
        inner.m2();
    }

    public static void main(String[] args) {
        MethodChaining outer = new MethodChaining();
        outer.m1();
    }
}
