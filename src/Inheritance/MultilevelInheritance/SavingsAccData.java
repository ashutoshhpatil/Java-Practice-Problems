package Inheritance.Assignment1.MultilevelInheritance;

class Bank{
    String bankName = "Saraswat Bank";
    String branchName = "Hadapsar";

    void dispBank(){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Branch Name: "+branchName);
    }
}

class Account extends Bank{
    Long accNum = 78978978978L;
    String accHolder = "Johnson Charles";
    float balance;
    float deposit = 50000;

    void calcBalance(){
        balance += deposit;
    }
}

class SavingsAccount extends Account{
    float interestRate = 0.12f;
    float interest;

    void getInterest(){
        interest = balance*interestRate;

        balance = balance+interest;
    }

    void dispDetails(){
        super.dispBank();
        System.out.println("Account Holder: "+accHolder);
        System.out.println("Account Number: "+accNum);
        System.out.println("Interest Rate: "+interestRate);
        System.out.println("Interest on Balance: "+interest);
        System.out.println("Total Balance: "+balance);
    }
}

public class SavingsAccData {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.calcBalance();
        sa.getInterest();
        sa.dispDetails();
    }
}
