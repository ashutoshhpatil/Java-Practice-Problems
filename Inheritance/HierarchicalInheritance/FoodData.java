package Inheritance.HierarchicalInheritance;

class FoodDelivery{
    int price;
    String foodName;
    int quantity;
    int deliveryCharge=40;
    float GST=0.14f;
    float totalBill;
    float bill;
}

class Veg extends FoodDelivery{
    void dispVeg(){
        foodName = "Veg Manchurian";
        price = 50;
        quantity=5;

        bill = price*quantity;
        totalBill = bill+(bill*GST);

        System.out.println("Food Name: "+foodName);
        System.out.println("Food Price: "+price);
        System.out.println("Food Quantity: "+quantity);
        System.out.println("Total Bill: "+totalBill);
    }
}

class NonVeg extends FoodDelivery{
    void dispNonVeg(){
        foodName = "Butter Chicken";
        price = 250;
        quantity=3;

        bill = price*quantity;
        totalBill = bill+(bill*GST);

        System.out.println("Food Name: "+foodName);
        System.out.println("Food Price: "+price);
        System.out.println("Food Quantity: "+quantity);
        System.out.println("Total Bill: "+totalBill);
    }
}
public class FoodData {
    public static void main(String[] args) {
        Veg vv=new Veg();
        vv.dispVeg();

        System.out.println("=============");

        NonVeg nv = new NonVeg();
        nv.dispNonVeg();

    }
}
