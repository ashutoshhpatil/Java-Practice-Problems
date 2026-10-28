package Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myRunnable implements Runnable{
    String name;

    myRunnable(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name+"job started by Thread: "+Thread.currentThread().getName());
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){}
        System.out.println(name+"job completed by Thread: "+Thread.currentThread().getName());
    }
}

public class ThreadPool{
    public static void main(String[] args) {
        myRunnable jobs[]={new myRunnable("Durga"),
                new myRunnable("Ravi"),
                new myRunnable("Shiva"),
                new myRunnable("Pavan"),
                new myRunnable("Ashutosh"),
                new myRunnable("Aditya"),
                new myRunnable("Sharvari")
        };
        ExecutorService service = Executors.newFixedThreadPool(6);
        for(myRunnable job: jobs){
            service.submit(job);
        }

        service.shutdown();
    }
}
