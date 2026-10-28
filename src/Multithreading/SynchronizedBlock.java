package Multithreading;

class DisplayThread{
    public void wish(String name){
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Good Evening: " + name);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}

class ThreadBlock extends Thread{
    DisplayThread d;
    String name;

    ThreadBlock(DisplayThread d,String name){
        this.d=d;
        this.name =name;
    }
    public void run(){
        d.wish(name);
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        DisplayThread d = new DisplayThread();
        ThreadBlock t1 = new ThreadBlock(d,"Dhoni");
        ThreadBlock t2 = new ThreadBlock(d,"Rohit");
        ThreadBlock t3 = new ThreadBlock(d,"Virat");
        t1.start();
        t2.start();
        t3.start();


    }
}
