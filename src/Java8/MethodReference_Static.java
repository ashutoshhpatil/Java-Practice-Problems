package Java8;

class Data{
      static void show(){
        for(int i=0;i<5;i++){
            System.out.println("Child Thread-1");
        }
    }
}

public class MethodReference_Static {
    public static void main(String[] args) {

        Runnable r = Data :: show;          //////  ClassName :: MethodName();

        Thread t1 = new Thread(r);
        t1.start();

        for(int i=0;i<5;i++){
            System.out.println("Parent Thread-1");
        }
    }
}
