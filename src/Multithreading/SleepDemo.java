package Multithreading;

public class SleepDemo extends Thread  {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("A");
        Thread.sleep(1000);

        System.out.println("S");
        Thread.sleep(1000);

        System.out.println("H");
        Thread.sleep(1000);

        System.out.println("U");
        Thread.sleep(1000);

        System.out.println("T");
        Thread.sleep(1000);

        System.out.println("O");
        Thread.sleep(1000);

        System.out.println("S");
        Thread.sleep(1000);

        System.out.println("H");
        Thread.sleep(1000);

        System.out.println("Thanks");
    }
}


//class SildeRotator {
//    public static void main(String[] args) throws InterruptedException {
//        for(int i=1;i<=10;i++){
//            System.out.println("Slide "+ i);
//            Thread.sleep(1000);
//        }
//    }
//}
