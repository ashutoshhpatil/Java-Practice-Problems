package ClassandObjects;

public class OnlineFoodOrder {

    String customerName;
    String foodItem;
    int quantity;
    int pricePerItem;
    int totalAmount;
    float discount =0.10f;
    int finalAmount;
    String orderStatus;
    int discountedAmount;

    void placeOrder(){
        if(foodItem.equalsIgnoreCase("Pizza")){
            pricePerItem = 300;
        } else if (foodItem.equalsIgnoreCase("Dal Khichdi")) {
            pricePerItem = 180;
        }else if (foodItem.equalsIgnoreCase("Chapati-Bhaji")){
            pricePerItem = 100;
        }else if(foodItem.equalsIgnoreCase("Sandwich")){
            pricePerItem = 220;
        }
        else{
            System.out.println("Not Available");
        }
        totalAmount = pricePerItem*quantity;
        finalAmount = totalAmount;
        orderStatus = "Order Placed";
    }

    void applyCoupon(){
        if(totalAmount>1000){
            System.out.println("You are eligible for 10% discount");
            discountedAmount = totalAmount -(int)(totalAmount*discount);
            finalAmount = discountedAmount;
        }else {
            System.out.println("No Discount");
        }
    }

    void cancelOrder(){
        if(orderStatus.equalsIgnoreCase("Order Placed")){
            int cancellationCharge = (int)(totalAmount*0.5);

            orderStatus = "Cancelled";

            System.out.println("Cancellation charge: "+cancellationCharge);
        }

    }

    void updateQuantity(int extraItems){

        quantity += extraItems;

        totalAmount = quantity * pricePerItem;

        if(totalAmount > 1000){
            finalAmount = totalAmount - (int)(totalAmount * discount);

        }
        else{
            finalAmount = totalAmount;
        }
    }

    void displayOrderDetails(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Food Item: "+foodItem);
        System.out.println("Quantity "+quantity);
        System.out.println("Price Per Item "+pricePerItem);
        System.out.println("Total Amount "+ totalAmount);
        System.out.println("Discounted Amount: "+finalAmount);
        System.out.println("Order Status "+orderStatus);
    }

    public static void main(String[] args) {
        OnlineFoodOrder food = new OnlineFoodOrder();
        food.customerName = "Sairam";
        food.foodItem = "Pizza";
        food.quantity = 4;
        food.placeOrder();
        food.applyCoupon();
        //food.cancelOrder();
        food.updateQuantity(3);
        food.displayOrderDetails();
    }
}
