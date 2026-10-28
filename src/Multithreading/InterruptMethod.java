package Multithreading;

class ThreadInterrupt extends Thread{
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("I'm Lazy Thread");
                Thread.sleep(1000);
            }
        }
            catch (InterruptedException e){
                System.out.println("I got Interrupted by Main Thread");
            }
        }
    }

public class InterruptMethod {
    public static void main(String[] args) {
        ThreadInterrupt ti = new ThreadInterrupt();
        ti.start();
        ti.interrupt();
        System.out.println("Successfully Interrupted");
    }
}
