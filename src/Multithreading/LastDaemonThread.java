package Multithreading;

class DaemonThread1 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}

public class LastDaemonThread {
    public static void main(String[] args) {
        System.out.println("Start of Main Thread");
        DaemonThread1 t1 = new DaemonThread1();
        t1.setDaemon(true);
        t1.start();
        System.out.println("End of Main Thread");
    }
}
