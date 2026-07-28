package Polymorphism.Overriding;

class Parent{
    void marry(){
        System.out.println("Appalamma");
    }

    void property(){
        System.out.println("Gold+Cash+Land");
    }
}

class Child extends Parent{
    @Override
    void marry() {
        System.out.println("Subbulaxmi");
    }
}

public class IntroToOverriding{

    public static void main(String[] args) {
        Parent obj = new Child();
        obj.property();
        obj.marry();
    }
}
