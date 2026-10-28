package Multithreading;

public class ThreadGroup {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup().getName());  //main

        System.out.println(Thread.currentThread().getThreadGroup().getParent());  // java.lang.ThreadGroup[name=system,maxpri=10]

        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());  //system
    }
}
