package Abstraction;

 abstract class FoodPlatform{
    String platformName="Swiggy";
    String customerName;
    int customerNum;
    String deliveryAdd;
    int orderID;

    abstract int calcPlatformFee();
    void dispCustomer(){
        System.out.println("Order ID: "+orderID);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Mobile NUmber: "+customerNum);
        System.out.println("Delivery Address: "+deliveryAdd);
    }

}

abstract class Restaurant extends FoodPlatform{
     String resName;
     String cuisineType;
     int foodAmount;
     int packagingCharge;
     float restaurantRating;
    int deliveryDistance;
    int deliveryCharge;
    boolean couponDiscount;
    int couponAmount;
    float gst = 0.06f,gstAmount;
    int bill;
    float finalAmount;


    abstract void calcRestaurantCharge();

     void dispRestaurant(){
         super.dispCustomer();
         System.out.println("-----------------------------");
         System.out.println("Restaurant Name: "+resName);
         System.out.println("Cousin Type: "+cuisineType);
         System.out.println("Food Amount: "+foodAmount);
         System.out.println("Packaging Charge: "+packagingCharge);

         System.out.println("Delivery Charge: "+deliveryCharge);
         System.out.println("Bill Invoice : "+bill);

         System.out.println("GST Amount: "+gstAmount);
         System.out.println("Final Amount: "+finalAmount);

         System.out.println("Rating : "+restaurantRating+ " /5");
     }
}

class PremiumOrder extends Restaurant{
    {
        orderID = 450;
        customerName ="Ashutosh";
        customerNum=897845654;
        deliveryAdd="Saiprasad Residency Vadgaon";
        resName = "Shivji Sweets";
        cuisineType = "Indian";
        foodAmount = 550;
        packagingCharge = 100;
        restaurantRating= 4.7f;
        deliveryDistance = 11;

    }

    @Override
    int calcPlatformFee() {
        return 200;
    }

    @Override
    void calcRestaurantCharge() {
        if(deliveryDistance>10){
            deliveryCharge = 200;
        } else if (deliveryDistance>5){
            deliveryCharge = 100;
        }else {
            deliveryCharge = 70;
        }

        if(couponDiscount){
            couponAmount= 250;
        }
        bill =  deliveryCharge+foodAmount+packagingCharge-couponAmount;

        gstAmount = gst*bill;

        finalAmount = bill +gstAmount;

        dispRestaurant();
    }
}

public class OnlineFoodDelivery {
    public static void main(String[] args) {
        Restaurant obj;
        obj= new PremiumOrder();
        obj.calcPlatformFee();
        obj.calcRestaurantCharge();
    }
}
