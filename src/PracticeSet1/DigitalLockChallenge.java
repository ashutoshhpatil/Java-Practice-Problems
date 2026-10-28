package PracticeSet1;

import java.util.Scanner;

public class DigitalLockChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        int product  = num1*num2*num3;

        boolean hasPair = (num1==num2 || num2 == num3 || num1 == num3);

        boolean mathPasses = (sum%5==0 && product %2 ==0);

        if(hasPair && mathPasses){
            System.out.println("lock Opened");
        }else {
            System.out.println("Lock Closed");
        }
    }
}
