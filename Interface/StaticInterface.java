package Interface;

import java.util.Scanner;

interface ATM{
    Scanner sc =new Scanner(System.in);
    int minBalance = 500;
    void withdraw();

    void deposit();

    static void minBalanceRule(){
        System.out.println("Minimum Balance Amount: "+minBalance);
    }
}

class SBIATM implements ATM{
    String userName = "Ashutosh";
    int withdrawAmount;
    int depositAmount;
    int balance = 8500;
    int remain;


    public void withdraw(){
        System.out.println("Enter amount to withdraw:");
        withdrawAmount = sc.nextInt();

        if(withdrawAmount>balance){
            System.out.println("Insufficient Balance");
            return;
        }else {
            System.out.println("Eligible to withdraw");
        }

        remain =  balance -withdrawAmount;
        System.out.println("Remaining Amount: "+remain);
    }

    public void deposit(){
        System.out.println("Enter Amount to Deposit: ");
        depositAmount = sc.nextInt();

        balance=remain;

        balance = balance+depositAmount;

        System.out.println("Total Balance: "+balance);
    }
}

public class StaticInterface {
    public static void main(String[] args) {
        ATM obj = new SBIATM();
        ATM.minBalanceRule();
        obj.withdraw();
        obj.deposit();
    }
}
