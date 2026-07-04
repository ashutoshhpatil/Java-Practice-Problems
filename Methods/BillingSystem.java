package Methods.Assignment1;

public class BillingSystem {
    String customerName;
    String productName;
    int quantity;
    int price;
    int totalBill;

    void productDetails(String customerName,String productName){
        this.customerName = customerName;
        this.productName = productName;
    }

    int getPrice(){
         if(productName.equalsIgnoreCase("Wheat")){
            price = 50;
        }
        else if(productName.equalsIgnoreCase("Rice")){
            price = 40;
        }
        else if(productName.equalsIgnoreCase("Jowar")){
            price = 35;
        }
        else if(productName.equalsIgnoreCase("Sprouts")){
            price = 150;
        }else {
            System.out.println("Product Not Available");
        }
        return price;
    }

    int calculateBill(int quantity){

        this.quantity=quantity;
        totalBill = price*quantity;
        return totalBill;
    }

    void dispDetails(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Product Name "+productName);
        System.out.println("Price/Kg : "+price);
        System.out.println("Quantity: "+quantity);
    }

    public static void main(String[] args) {
        BillingSystem billingSystem = new BillingSystem();
        billingSystem.productDetails("Ashutosh","rice");
        billingSystem.getPrice();
        billingSystem.calculateBill(15);
        billingSystem.dispDetails();
        System.out.println("Toatl Bill: "+billingSystem.totalBill);
    }
}
