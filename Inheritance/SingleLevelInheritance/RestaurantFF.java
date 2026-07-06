package Inheritance.Assignment1.SingleLevelInheritance;

class Restaurant{
    String resName;
    String ownerName;
    String location;
    Long contactNum;
}

class FastFood extends Restaurant{
    String foodName;
    int quantity;
    int price;
    float gst = 0.08f;
    int totalBill;

    void getDetails(){
        if(foodName.equals("Aloo Chat")){
            price = 30;
        } else if (foodName.equals("Bhelpuri")) {
            price = 50;
        } else if (foodName.equals("Vadapav")) {
            price = 25;
        }else {
            System.out.println("Invalid Food Item");
            return;
        }

        totalBill = price*quantity;

        totalBill = totalBill+(int)(totalBill*gst);
    }

    void dispDetails(){
        System.out.println("Restaurant Name: "+resName);
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Location:  "+location);
        System.out.println("Contact Number:  "+contactNum);
        System.out.println("Food Name: "+foodName);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: "+price);
        System.out.println("GST: "+(totalBill*0.08));
        System.out.println("Total Bill: "+totalBill);
    }
}

public class RestaurantFF {
    public static void main(String[] args) {
        FastFood ff = new FastFood();
        ff.resName = "Akshay Biryani";
        ff.ownerName = "Akshay";
        ff.location = "Pune";
        ff.contactNum = 9878987898L;
        ff.foodName  = "Vadapav";
        ff.quantity = 5;
        ff.getDetails();
        ff.dispDetails();

    }
}
