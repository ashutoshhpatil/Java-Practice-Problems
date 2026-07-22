// Static Keyword-Interface

package Abstraction;

interface InterfaceDemo2 {
    static void run() { // Static Keyword used here - cannot be overriden
        System.out.println("In static-run");
    }

    void fun();
}

class Demo3 implements InterfaceDemo2 {
    public void fun() {
        System.out.println("In fun");
    }
}

class InterfaceClientDemo {
    public static void main(String[] args) {
        Demo3 obj = new Demo3();

        InterfaceDemo2.run(); // Static keyword calling
        obj.fun();
    }
}
