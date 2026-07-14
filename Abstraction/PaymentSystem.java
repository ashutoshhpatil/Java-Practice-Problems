package Abstraction;

import java.sql.SQLOutput;

abstract class Payment{
    int paymentId;
    String customerName;
    float amount;
    String paymentMethod;
    float surCharge;
    float totalAmount;
    float surChargeAmount;

    abstract void processPayment();
    abstract void displayReceipt();
}

class Creditcard extends Payment{
    {
        paymentId = 5621;
        customerName = "Ashutosh";
        amount = 56250;
        paymentMethod = "Credit Card";
    }
        void processPayment(){

            surCharge = 0.05f;
            surChargeAmount = (amount*surCharge);
            totalAmount = amount+surChargeAmount;

    }
       void displayReceipt(){
           System.out.println("Payment Id: "+paymentId);
           System.out.println("Customer Name: "+customerName);
           System.out.println("Amount: "+amount);
           System.out.println("Payment Method: "+paymentMethod);
           System.out.println("Extra Charge: "+surChargeAmount);
           System.out.println("Total Amount: "+totalAmount);
       }
}

class UPI extends Payment {
    {
        paymentId = 101;
        customerName = "Webwide";
        amount = 5000;
        paymentMethod = "UPI";
    }

    void processPayment() {

            surCharge = 0.02f;
            surChargeAmount = (amount*surCharge);
            totalAmount = amount+surChargeAmount;

    }

    void displayReceipt() {
        System.out.println("Payment Id: " + paymentId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Payment Method: " + paymentMethod);
        System.out.println("Extra Charge: " + surChargeAmount);
        System.out.println("Total Amount: " + totalAmount);
    }
}

 class Cash extends Payment{
     {
         paymentId = 103;
         customerName = "Webwide 2";
         amount = 15000;
         paymentMethod = "Cash";
     }
     void processPayment(){

             surCharge=0;
             surChargeAmount = (amount*surCharge);
             totalAmount = amount+surChargeAmount;

     }

     void displayReceipt(){
         System.out.println("Payment Id: "+paymentId);
         System.out.println("Customer Name: "+customerName);
         System.out.println("Amount: "+amount);
         System.out.println("Payment Method: "+paymentMethod);
         System.out.println("Extra Charge: "+surChargeAmount);
         System.out.println("Total Amount: "+totalAmount);
     }
    }


public class PaymentSystem {
    public static void main(String[] args) {
//        Cash obj = new Cash();
//        obj.processPayment();
//        obj.displayReceipt();

//        UPI obj2 = new UPI();
//        obj2.processPayment();
//        obj2.displayReceipt();

        Payment obj = new Cash();  // Abstraction Concept
        obj.processPayment();
        obj.displayReceipt();
    }
}
