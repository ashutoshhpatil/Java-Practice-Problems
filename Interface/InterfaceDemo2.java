//Default Keyword-Interface

package Abstraction;

interface InterfaceDemo {
    // body given to method 'run' using the default keyword
    default void run() {
        System.out.println("In run");
    }

    void fun(); // abstract method
}

class Demo1 implements InterfaceDemo {
    public void fun() {
        System.out.println("In Demo-1 fun");
    }
}

class Demo2 implements InterfaceDemo {
    public void fun() {
        System.out.println("In Demo-2 fun");
    }
}

class InterfaceClient {
    public static void main(String[] args) {
        InterfaceDemo obj;
        obj = new Demo1();
        obj.run();
        obj.fun();

        obj = new Demo2();
        obj.run();
        obj.fun();
    }
}
