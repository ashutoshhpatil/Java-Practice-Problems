package ConditionalStatements;

import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount:");
        int amount = sc.nextInt();
        int balance = 50000;
        int dailylimit = 25000;

        if(amount<=0){
            System.out.println("Please enter correct amount");
        }
        else if(amount%100!=0){
            System.out.println(" Rejected: Amount must be a multiple of 100");
        }
        else if(amount>balance){
            System.out.println("Rejected: Insufficient balance ");
        }
        else if(amount>dailylimit){
            System.out.println(" Rejected: Exceeds daily withdrawal limit");
        }
        else {
            System.out.println("Total Balance: "+balance);
            System.out.println("Amount withdrawn: "+amount);
            System.out.println("Approved. Withdrawal successful");
            balance = balance-amount;
            System.out.println("Remaining balance: "+balance);
        }
    }

}
