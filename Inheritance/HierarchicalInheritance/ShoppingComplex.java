package Inheritance.HierarchicalInheritance;

class ShoppingMall{
    float discount = 0.10f;
    float totalBill;
    float discountedAmount;
}

class ClothingStore extends ShoppingMall{
    int shirtPrice = 1000;
    int pantPrice = 2000;

    void calcBill(){
        totalBill = shirtPrice+pantPrice;
        discountedAmount = totalBill*discount;
        totalBill = totalBill-(discountedAmount);
    }

    void dispCS(){
        System.out.println("Shirt Price: "+shirtPrice);
        System.out.println("Pant PrICE: "+pantPrice);
        System.out.println("Discounted Amount: "+discountedAmount);
        System.out.println("Total Bill: "+totalBill);
    }
}

class ElectronicsStore extends ShoppingMall{
    float mobilePrice = 22500;
    float GST = 0.10f;
    int warrantyYears = 2;

    void getBill(){
        totalBill = mobilePrice+(mobilePrice*GST);
        discountedAmount = totalBill*discount;
        totalBill = totalBill-(discountedAmount);
    }

    void dispES(){
        System.out.println("Mobile Price: "+mobilePrice);
        System.out.println("Discounted Amount: "+discountedAmount);
        System.out.println("Total Bill : "+totalBill);
    }
}
public class ShoppingComplex {
    public static void main(String[] args) {
        ClothingStore cs = new ClothingStore();
        cs.calcBill();
        cs.dispCS();

        System.out.println();

        ElectronicsStore es = new ElectronicsStore();
        es.getBill();
        es.dispES();
    }
}
