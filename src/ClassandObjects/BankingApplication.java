package ClassandObjects;

import java.util.Scanner;

public class BankingApplication {
    Scanner sc = new Scanner(System.in);

    int pin;
    int balance = 89500;
    int remainingAmount;

    void verifyPin(){
        System.out.println("Enter PIN:");
        pin = sc.nextInt();
        if(pin != 1234) {
            System.out.println("Incorrect PIN");
            System.exit(0);
        }
    }

    void checkBalance(){
        System.out.println("The Avaliable balance is: "+balance );
    }

    void deposit(){
        System.out.println("Enter the amount to deposit:");
        int deposit = sc.nextInt();
        int depositedAmount = deposit +balance;

        System.out.println("The amount after deposit: "+depositedAmount);
        balance = depositedAmount;
    }

    void withDraw(){
            System.out.println("Enter the amount to withdraw:");
            int withdrawAmount = sc.nextInt();
            if(withdrawAmount < balance) {
                remainingAmount = (balance - withdrawAmount);
                System.out.println("Remaining Amount: " +remainingAmount );
            }else {
                System.out.println("Insuficient balance");
            }
            balance = remainingAmount;
    }
    public static void main(String[] args) {
        BankingApplication aa = new BankingApplication();
        aa.verifyPin();
        aa.checkBalance();
        aa.deposit();
        aa.withDraw();
    }
}
