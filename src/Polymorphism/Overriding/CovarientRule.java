package Polymorphism.Overriding;

class Parent1{
    public  Object m1(){
        return null;
    }
}

class Child1 extends Parent1{
    public String m1(){ // Co- varient Data Type allowed from 1.5 Version
        return null;
    }
}

public class CovarientRule {
    public static void main(String[] args) {

    }
}
