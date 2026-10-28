package Multithreading;

class ThreadA1 extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Child thread starts calculations");
            for (int i = 0; i <= 100; i++) {
                total += i;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();

        }
    }
}

public class WaitDemo {
    public static void main(String[] args) throws Exception{
        ThreadA1 t = new ThreadA1();
        t.start();
        synchronized (t){
            System.out.println("Main Thread trying to call wait() method");
            t.wait();

            System.out.println("Main thread got notification");

            System.out.println(t.total);
        }

    }
}
