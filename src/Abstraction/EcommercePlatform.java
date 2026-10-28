package Abstraction;

abstract  class Platform{
    String platformName = "Amazon";
    String sellerName = "Javed & Habib";
    String customerName = "Alexander";

    abstract void  calcPlatformFee();

    void dispPlatform(){
        System.out.println("Platform Name: "+platformName);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Seller Name: "+sellerName);
    }
}

abstract class Product extends  Platform{
    String productName;
    int quantity;
    float pricePerItem,totalPrice,discount,discountedAmount,gst,gstAmount, platformFeeAmount,platformFee,deliveryCharge,finalAmount;

    abstract  void calcDiscount();
    abstract  void calcGST();

    void calcTotal(){
        totalPrice = pricePerItem * quantity;
    }
    void generateBill(){
        finalAmount = totalPrice -discountedAmount+gstAmount+platformFeeAmount+deliveryCharge;
    }

    void dispShopping(){
        dispPlatform();
        calcTotal();
        calcDiscount();
        calcGST();
        calcPlatformFee();
        generateBill();
        dispFinalBill();
    }

    void dispFinalBill(){
        System.out.println("Product Name: "+productName);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price Per Item: "+pricePerItem);
        System.out.println("Discounted Amount: "+discountedAmount);
        System.out.println("GST Amount: "+gstAmount);
        System.out.println("Platform Fee: "+platformFeeAmount);
        System.out.println("Delivery Charge: "+deliveryCharge);
        System.out.println("Total Bill: "+finalAmount);
    }
}

class Electronics extends Product{
    {
        productName = "Laptop";
        pricePerItem = 75000;
        quantity = 2;
        discount = 0.05f;
        gst = 0.18f;
        platformFee = 0.02f;
        deliveryCharge=250;
    }

    @Override
    void calcGST() {
         gstAmount= gst*totalPrice;
    }

    @Override
    void calcDiscount() {
        discountedAmount = discount*totalPrice;
    }

    @Override
    void calcPlatformFee() {
        platformFeeAmount = platformFee * totalPrice;
    }
}

class Furniture extends Product{
    {
        productName = "Chair=Table";
        pricePerItem = 3500;
        quantity = 75;
        discount = 0.10f;
        gst = 0.18f;
        platformFee = 0.02f;
        deliveryCharge = 1000;
    }

    @Override
    void calcGST() {gstAmount= gst*totalPrice; }

    @Override
    void calcDiscount() {
        discountedAmount = discount*totalPrice;
    }

    @Override
    void calcPlatformFee() {
        platformFeeAmount = platformFee * totalPrice;
    }
}

class Clothing extends Product{
    {
        productName = "Uniforms";
        pricePerItem = 350;
        quantity = 100;
        discount = 0.20f;
        gst = 0.10f;
        platformFee = 0.02f;
        deliveryCharge = 500;
    }

    @Override
    void calcGST() {gstAmount= gst*totalPrice; }

    @Override
    void calcDiscount() {
        discountedAmount = discount*totalPrice;
    }

    @Override
    void calcPlatformFee() {
        platformFeeAmount = platformFee * totalPrice;
    }

}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product obj;
        obj = new Electronics();
        obj.dispShopping();
    }
}
