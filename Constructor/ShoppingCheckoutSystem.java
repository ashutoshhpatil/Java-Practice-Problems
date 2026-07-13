package Constructor;

import java.sql.SQLOutput;

class Shopping{
    int orderId;
    String customerName;
    double cartValue;
    String membership;
    boolean couponApplied;
    double discount;
    double extraOff;
    double gst;
    double shippingCharge;
    double finalAmount;
    double gstAmount;

    void calcBill(){
        if(membership.equals("Bronze")){
            discount=0.05*cartValue;
        } else if (membership.equals("Silver")){
            discount=0.10*cartValue;
        } else if (membership.equals("Gold")) {
            discount=0.20*cartValue;
        }else {
            discount=0*cartValue;
        }

        if(couponApplied){
            extraOff = 500;
        }else {
            extraOff=0;
        }

        if(cartValue>=50000){
            shippingCharge=0;
        }else {
            shippingCharge=250;
        }

        gst = 0.08;
        gstAmount = gst * (cartValue-discount-extraOff);


        finalAmount = cartValue-discount-extraOff+gstAmount+shippingCharge;
    }

    Shopping(){
        this(1001,"Guest",25000,"Bronze",false);
    }

    Shopping(int orderId){
        this(orderId,"Guest",25000,"Bronze",false);
    }

    Shopping(int orderId,String customerName){
        this(orderId,customerName,25000,"Bronze",false);
    }

    Shopping(int orderId,String customerName,double cartValue){
        this(orderId,customerName,cartValue,"Bronze",false);
    }

    Shopping(int orderId,String customerName,double cartValue,String membership){
        this(orderId,customerName,cartValue,membership,false);
    }

    Shopping(int orderId, String customerName, double cartValue, String membership, boolean couponApplied){

        this.orderId=orderId;
        this.customerName=customerName;
        this.cartValue=cartValue;
        this.membership=membership;
        this.couponApplied=couponApplied;

        calcBill();

        System.out.println("Order ID: "+orderId);
        System.out.println("Customer Name: "+customerName);
        System.out.println("Cart Value: "+cartValue);
        System.out.println("Membership: "+membership);
        System.out.println("Is Coupon Applied: "+couponApplied);
        System.out.println("Cartvalue Discount: "+discount);
        System.out.println("Gst Amount: "+gstAmount);
        System.out.println("Cupon Discount: "+extraOff);
        System.out.println("Shipping Charges: "+shippingCharge);
        System.out.println("Total BIll: "+finalAmount);
    }
}

public class ShoppingCheckoutSystem {
    public static void main(String[] args) {
        Shopping s1 = new Shopping();
        System.out.println("=====================");
       Shopping s10 = new Shopping(1009, "Anjali", 45000, "Bronze", true);
    }
}
