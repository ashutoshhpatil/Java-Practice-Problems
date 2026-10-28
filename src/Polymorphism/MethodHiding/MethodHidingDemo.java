package Polymorphism.MethodHiding;

class Parent{
    static void m1(){
        System.out.println("Parent Method");
    }
}

class Child extends Parent{
    static void m1(){
        System.out.println("Child Method");
    }
}

public class MethodHidingDemo {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.m1();
    }
}
