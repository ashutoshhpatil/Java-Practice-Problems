package Multithreading;

class ThreadJoin extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Seetha Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadJoin t =new ThreadJoin();
        t.start();
        t.join(1000,50);

        for(int i=0;i<10;i++){
            System.out.println("Rama Thread");
        }
    }
}
