package Multithreading;

class ThreadYield extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
        System.out.println("Child Thread");
        Thread.yield();
    }
    }
}

public class YieldDemo {
    public static void main(String[] args) {
        ThreadYield t = new ThreadYield();
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Parent Thread");
        }
    }
}
