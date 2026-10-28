package ConditionalStatements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A1:Coke Rs 25");
        System.out.println("A2:Chips Rs 20");
        System.out.println("A3:Water Rs 15");
        System.out.println("Enter product code");
        String productCode = sc.next();

        int price;
        String itemname;

        switch (productCode){
            case "A1":
                price = 25;
                itemname = "Coke";
                break;

            case "A2":
                price = 20;
                itemname = "Chips";
                break;

            case "A3":
                price = 15;
                itemname = "Water";
                break;

            default:
                System.out.println("Invalid Product Code");
                System.exit(0);
                return;
        }

        System.out.println("Enter Amount");
        int amount  = sc.nextInt();
        if(amount <=0){
            System.out.println("Please pay the amount");
            return;
        }
        System.out.println("Enter Quantity");
        int quantity = sc.nextInt();
        if(quantity<=0){
            System.out.println("Please enter no of items");
            return;
        }

        int change;
        int moreamount;
        int totalPrice = price*quantity;

        if(amount>totalPrice){
            change = amount-totalPrice;
            System.out.println("Total Bill: "+totalPrice);
            System.out.println("Inserted Amount: "+amount);
            System.out.println("Change Amount: "+change);
            System.out.println("Dispensing "+itemname);
        }
        else if(amount<totalPrice){
            moreamount = totalPrice-amount;
            System.out.println("Total Bill: "+totalPrice);
            System.out.println("Insufficient Amount ....Add more "+moreamount);
        }
        else{
            System.out.println("Total Bill: "+totalPrice);
            System.out.println("Exact Amount Paid");
            System.out.println("Dispensing "+itemname);
        }



    }
}
