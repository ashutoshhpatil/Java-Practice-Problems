package Abstraction;

abstract class Parent {
    Parent() {
        super();
        System.out.println("Parent's Constructor");
    }

    void career() { // Concrete Method
        System.out.println("Engineering");
    }

    abstract void marry(); // Abstract Method
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child's Constructor");
    }

    void marry() {
        System.out.println("Anushka Pandit");
    }
}

class Client {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.career();
        obj.marry();
    }
}
