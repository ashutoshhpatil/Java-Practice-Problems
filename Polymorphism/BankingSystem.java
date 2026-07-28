package Polymorphism.Overriding;

class Account{
    int accountNo;
    String accHolderName;
    double balance;
    double updatedBalance;

    void deposit(double amount){

    }

    void withDraw(double amount){

     }

    void displayAccountDetails(){
        System.out.println("Account Details are as follows:");
        System.out.println("Account Holder Name: "+accHolderName);
        System.out.println("Account Number: "+accountNo);
        System.out.println("Balance: "+ updatedBalance);
    }
}

class SavingsAccount extends Account{
    final int minBalance = 1000;

    SavingsAccount(double b){
        this.balance=b;
        accHolderName = "Ashutosh";
        accountNo = 789466;
    }

    @Override
    void withDraw(double amount) {
        super.withDraw(amount);
        if(balance>minBalance){
            System.out.println("Allowed to withdraw amount");
            System.out.println(" Withdrawn Amount: "+amount);
            updatedBalance = balance-amount;
        }else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    void deposit(double amount) {
        super.deposit(amount);
        if(amount>=0){
            System.out.println("Alloed to Deposit");
            System.out.println("Deposited Amount: "+amount);
            updatedBalance = balance+amount;

        }else {
            System.out.println("Amount must be greater than 0");
        }
    }
}

class CurrentAccount extends Account{
    int overDraftLimit = 5000;
     double newLimit = overDraftLimit+balance;

    @Override
    void withDraw(double amount) {

        if(amount<newLimit){
            System.out.println("Allowed to Withdraw");
            updatedBalance = newLimit-amount;
        }else {
            System.out.println("Not Allowed");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account ac = new SavingsAccount(25000);
        ac.deposit(10000);
        ac.displayAccountDetails();
        System.out.println("=====================");
        ac.withDraw(15000);
        ac.displayAccountDetails();

    }
}
