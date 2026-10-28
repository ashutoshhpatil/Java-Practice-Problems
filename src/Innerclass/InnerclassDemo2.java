package Innerclass;

class Outer1{
    int x =10;
    class Inner1{
        int x = 100;

        void m1(){
            int x = 1000;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(Outer1.this.x);
        }
    }
}

public class InnerclassDemo2 {
    public static void main(String[] args) {
        new Outer1().new Inner1().m1();    // Object Chaining   Option 1
//
//        Outer1.Inner1 obj =  new Outer1().new Inner1();
//        obj.m1();             // Normal Method Calling  -- Option 2
    }
}
