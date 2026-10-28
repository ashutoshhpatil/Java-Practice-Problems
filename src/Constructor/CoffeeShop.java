package Constructor;

class CoffeeOrder{
    String coffeeCupSize;
    String milkType;
    boolean isIced;
    int sugarLevel;

    CoffeeOrder() {
        this("Medium","Whole",false,0);
    }

    CoffeeOrder(String coffeeCupSize){
        this(coffeeCupSize,"Whole",false,0);
    }

    CoffeeOrder(String coffeeCupSize,boolean isIced){
        this(coffeeCupSize,"Oat",isIced,0);
    }

    CoffeeOrder(String coffeeCupSize, String milkType,boolean isIced, int sugarLevel){

        this.coffeeCupSize = coffeeCupSize;
        this.isIced = isIced;
        this.milkType = milkType;
        this.sugarLevel = sugarLevel;

        System.out.println("Coffee Size: "+coffeeCupSize);
        System.out.println("Milk Type: "+milkType);
        System.out.println("Is Iced: "+isIced);
        System.out.println("Sugar Level: "+sugarLevel);
    }
}

public class CoffeeShop {
    public static void main(String[] args) {
        CoffeeOrder c1 = new CoffeeOrder();
        CoffeeOrder c2 = new CoffeeOrder("Large");
        CoffeeOrder c3 = new CoffeeOrder("Small",true);

    }

}
