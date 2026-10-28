package Multithreading;

public class ThreadPriority extends Thread{
     public void run(){
         for(int i=0;i<5;i++){
             System.out.println("Child Thread-1");
         }
     }
}

class ThreadPriorityDemo{
    public static void main(String[] args) {
        ThreadPriority t = new ThreadPriority();
        t.setPriority(10);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread-0");
        }
    }
}
