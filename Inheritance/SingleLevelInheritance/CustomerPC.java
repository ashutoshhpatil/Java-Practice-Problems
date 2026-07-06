package Inheritance.Assignment1.SingleLevelInheritance;

class Customer{
    int custId;
    String name;
    int purchaseAmount;
    int subscriptionCharges = 500;

    void subscriptionCharges(){
        System.out.println("-------For Normal Customer-----");
        purchaseAmount = subscriptionCharges;
        System.out.println("Subscription Charges: "+purchaseAmount );
    }
}

class PrimeCustomer extends  Customer{
    void subscriptionChargesPC(){
        System.out.println("-------For Prime Customer-----");
        purchaseAmount = subscriptionCharges -(int)(subscriptionCharges*0.10);
    }

    void dispDetails(){
        System.out.println("Name: "+name);
        System.out.println("Customer Id "+custId);

        System.out.println("Subscription Charges "+subscriptionCharges);
        System.out.println("Purchase Amount  "+purchaseAmount);
    }
}

public class CustomerPC {
    public static void main(String[] args) {
        PrimeCustomer pc = new PrimeCustomer();
        pc.name = "Jakie";
        pc.custId = 7845;
        pc.subscriptionCharges();

        pc.subscriptionChargesPC();
        pc.dispDetails();

    }
}
