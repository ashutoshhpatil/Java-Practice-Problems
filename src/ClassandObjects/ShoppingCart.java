package ClassandObjects;

public class ShoppingCart {
    String customerName;
    String productName;
    float price;
    int quantity;
    float totalAmount;
    float finalAmount;
    float discount = 0.10f;
    //float discountedAmount;


    void addItem(float price,int quantity){
        this.price = price;
        this.quantity=quantity;

        totalAmount = price*quantity;
    }

    void applyDiscount(){
        if(totalAmount>=5000){
            finalAmount = totalAmount -(totalAmount*discount);
        }
        else{
            finalAmount = totalAmount;
        }
    }

    void displayBill(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Product Name: "+productName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println("Total Amount: "+totalAmount);
        System.out.println("Final Amount: "+finalAmount);
        if(finalAmount ==  totalAmount -(totalAmount*discount) ){
            System.out.println("10% Discount applied suceesfully");
        }
        System.out.println("Thank You For Shopping With Us...Have a Nice Day!!!");
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.customerName ="Madhav";
        shoppingCart.productName= "Wheat Bags";
//        shoppingCart.price = 56.25f;
//        shoppingCart.quantity = 25;

        shoppingCart.addItem(50.25f,25);
        shoppingCart.applyDiscount();
        shoppingCart.displayBill();

    }
}
