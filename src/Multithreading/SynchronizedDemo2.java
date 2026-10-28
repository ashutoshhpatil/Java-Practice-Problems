package Multithreading;

class Info {
    public synchronized void displayNum(){
        for(int i=0;i<10;i++){
            System.out.print(i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }

    public synchronized void displayChar(){
        for(int i=65;i<75;i++){
            System.out.print((char)i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}

class ThreadNum extends Thread{
     Info d;

       ThreadNum(Info d){
         this.d=d;
     }
    public void run(){
        d.displayNum();
    }
}

class ThreadChar extends Thread{
     Info d;

      ThreadChar(Info d){
        this.d=d;
    }
    public void run(){
        d.displayChar();
    }
}

public class SynchronizedDemo2 {
    public static void main(String[] args) {
         Info d = new Info();
        ThreadNum t1 = new ThreadNum(d);
         ThreadChar t2 = new ThreadChar(d);
        t1.start();
        t2.start();
    }
}
