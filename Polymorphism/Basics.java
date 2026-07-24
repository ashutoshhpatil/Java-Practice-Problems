package Polymorphism.Overloading;

public class Basics {
    public void m1(int a){
        System.out.println("int-arg method");
    }

    public void m1(float a){
        System.out.println(" float-arg method");
    }

    public void m1(double a){
        System.out.println("double-arg method");
    }

    public static void main(String[] args) {
        Basics obj = new Basics();
        obj.m1(10);
        obj.m1(10.5f);
        obj.m1(10.5);
        obj.m1('a');  // char --> int (automatic conversion by JVM)
    }
}


// byte -> short -> char -> int -> long -> float -> double (if compatible type is not there then
//                                                          it converts to the next type)