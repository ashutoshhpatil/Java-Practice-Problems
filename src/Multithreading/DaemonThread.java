package Multithreading;

class Daemon extends Thread{

}

public class DaemonThread {
    public static void main(String[] args) {
        System.out.println("Main Thread Daemon Nature:" +Thread.currentThread().isDaemon());
        Daemon t = new Daemon();
        System.out.println("Child Thread Daemon Nature: "+t.isDaemon());
        t.setDaemon(true);
        System.out.println("Child Thread current Daemon Nature: "+t.isDaemon());
    }
}
