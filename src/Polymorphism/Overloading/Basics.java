package Polymorphism.Overloading;

public class Basics {
    public void m1(int a){
        System.out.println("int-arg method");
    }

    //(int... a --> can take any number of int values ranging from 0 to combination also)
    public void m1(int... a){
        System.out.println("Var-arg Method");
    }

    public void m1(float a){
        System.out.println(" float-arg method");
    }

    public void m1(double a){
        System.out.println("double-arg method");
    }

    public void m1(String a){
        System.out.println("String-arg method");
    }

    public static void main(String[] args) {
        Basics obj = new Basics();
        obj.m1(10);
        obj.m1(10.5f);
        obj.m1(10.5);
        obj.m1('a');  // char --> int (automatic conversion by JVM)
       // obj.m1(null); // Object ---> String (--> always choose the child class not the parent class
        obj.m1();
        obj.m1(10,20,30); // var-arg method (because var-arg method can take any number of int values)

        obj.m1(11);   // int-arg and var-arg both will participate in the race but int-arg is result as it is old concept
    }
}


/* String and all other classes
     ^
     |
     |
   Object
* */


// var-arg method is having least priority ... if no other method matched then var-arg method gets call


// byte -> short -> char -> int -> long -> float -> double (if compatible type is not there then
//                                                          it converts to the next type)