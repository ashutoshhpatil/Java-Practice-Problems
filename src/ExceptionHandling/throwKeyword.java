package ExceptionHandling;

class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException (String msg){
        super(msg);
    }
}

class BankAccount{
    private double balance;

    BankAccount( double balance){
        this.balance = balance;
    }
    void withdraw(double amount){
        System.out.println("Attempting to withdraw: "+amount);

        if(amount<=0){
            throw new IllegalArgumentException("Withdraw amount must be greater than 0");
        }

        if(amount>balance){
            throw new InsufficientBalanceException("Transaction failed ...Insufficient balance");
        }

        if(amount<=balance){
            System.out.println("Can withdraw money");
            balance -= amount;
            System.out.println("Remaining balance: "+balance);
        }
    }
}


public class throwKeyword {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        try{
            acc.withdraw(1600);
        }catch (RuntimeException e){
            System.err.println("Error: "+e.getMessage());
        }
    }
}
