package Inheritance.HierarchicalInheritance;

import org.w3c.dom.ls.LSOutput;

class Bank{
    String bankName = "SBI";
    String location = "Mumbai";
    float withdrawal;


    void dispBank(){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Location: "+location);
    }
}

class SavingsAccount extends Bank{
    float balance = 89500;
    float interest = 0.12f;
    float remain;


    void getInfo(){
        withdrawal = 500;
        if(balance>1000){
            System.out.println("Withdrawal is allowed....Proceed");
            if(withdrawal<balance) {
                remain = balance - withdrawal;
            }else {
                System.out.println("Insufficient Balance");
            }
        }else {
            System.out.println("According to Bank's  Policy You are not allowed to withdraw");
        }
    }

    void dispSavings(){
        super.dispBank();
        System.out.println("Balance: "+balance);
        System.out.println("Interest "+interest);
        System.out.println("Withdrawn Amount: "+withdrawal);
        System.out.println("Remaining Balance: "+remain);
    }
}


class CurrentAccount extends Bank{
    float balance = 25000;
    int overDraftNo = 3;

    void getCurrent(){
        withdrawal = 26000;
        if(withdrawal>balance && overDraftNo<5){
            System.out.println("OverDraft Available");
        }else {
            System.out.println("OverDraft unavailable");
        }
    }

    void dispCurrent(){
        super.dispBank();
        System.out.println("Balance: "+balance);
        System.out.println("OverDraft No: "+overDraftNo );
    }
}

public class CurrentAccData {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.getInfo();
        sa.dispSavings();

        System.out.println();

        CurrentAccount ca = new CurrentAccount();
        ca.getCurrent();
        ca.dispCurrent();

    }
}
