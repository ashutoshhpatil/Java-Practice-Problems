package ClassandObjects;

import java.util.Scanner;

public class BankAccount {

    float balance = 5000;

    Scanner sc = new Scanner(System.in);
    void getBalance(){
        System.out.println("The Available Balance: "+balance);
    }

    void withdraw(){
        System.out.println("Enter the Amount:");
        int amount = sc.nextInt();
        if(amount < 0)
            System.out.println("Invalid amount ...Try Again");
        else if (amount > 0 && amount < balance)
            System.out.println(amount+ " had been withdrawn successfully");
        else
            System.out.println("Amount exceeds the balance");

        balance = balance -amount;
        System.out.println("Remainning balance:" +balance);
    }

    void deposit(){
        System.out.println("Enter the amount to be deposited:");
        int deposit = sc.nextInt();

        balance = balance +deposit;
        System.out.println("The Avaliable balance is: " +balance);
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.getBalance();
        ba.withdraw();
        ba.deposit();
    }
}
