package Multithreading;

class Display{
    public synchronized void wish(String name){
        for(int i=0;i<5;i++){
            System.out.print("Good Morning: ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println(name);
        }
    }
}

class synchronization extends Thread{
    Display d;
    String name;

    synchronization(Display d, String name){
        this.d =d;
        this.name=name;
    }

    public void run(){
        d.wish(name);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();

        // Only one Thread at a time but we cant expect that it will start from "Dhoni"

        synchronization t1 = new synchronization(d, "Dhoni");
        synchronization t2 = new synchronization(d, "Rohit");
        synchronization t3 = new synchronization(d, "ABD");
        synchronization t4 = new synchronization(d, "Gayle");
        t1.start();;
        t2.start();
        t3.start();
        t4.start();
    }
}
