package DataHiding;

public class BankAccount {
    private int accNum;
    private String accName;
    private float balance;
    private float withdrawnAmount;
    private float depositedAmount;

    public void setInfo(int ac,String n,float b){
        accNum = ac;
        accName = n;
        if(b >= 0) {
            balance = b;
        }else {
            System.out.println("Invalid Balance");
        }
    }

    public void deposit(float depAmount){
        if(depAmount>0){
            depositedAmount = depAmount;
            balance += depAmount;
            System.out.println("Amount deposited successfully");
        }else{
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    public void withdraw(float withdrawAmount){
        if(withdrawAmount>0){
            if(withdrawAmount <= balance){
                withdrawnAmount = withdrawAmount;
                balance -= withdrawAmount;
                System.out.println("Amount Withdrawn Successfully.");
            }else {
                System.out.println("Insufficient Balance");
            }
        }else {
            System.out.println("Withdrawal amount must be greater than 0.");
        }
    }

    public void getDetails(){
        System.out.println("Account Number: "+accNum);
        System.out.println("Account Holder Name: "+accName);
        System.out.println("Withdrawn Amount: " + withdrawnAmount);
        System.out.println("Deposited Amount: " + depositedAmount);
        System.out.println("Current Balance: "+balance);
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.setInfo(78965412,"Ashutosh",10);
        obj.withdraw(2);
        obj.deposit(10);
        obj.getDetails();

    }
}
