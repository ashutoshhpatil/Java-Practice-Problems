//Interface Demo

package Abstraction;

interface InterDemo {
    void run();

    void fun();
}

class Demo implements InterDemo {
    public void run() {
        System.out.println("RUN Method");
    }

    public void fun() {
        System.out.println("FUN Method");
    }
}

class Client1 {
    public static void main(String[] args) {
        InterDemo obj = new Demo();
        obj.run();
        obj.fun();
    }
}
