package Polymorphism.Overloading;

public class IntroToOverloading {
    IntroToOverloading(){
        System.out.println("Constructor Calling");
    }

    void fun(int a){
        System.out.println("Fun Method with int datatype");
    }

    void fun(float b){
        System.out.println("Fun Method with float datatype");
    }

    void fun(double c){
        System.out.println("Fun Method with double datatype");
    }

    public static void main(String[] args) {
        IntroToOverloading obj = new IntroToOverloading();
        obj.fun(10);
        obj.fun(10.5f);
        obj.fun(25.45);
    }
}
