package Interface;

interface Electricity{
    void calcElectricityBill();
    void dispBill();
}

class User implements Electricity{
    String consumerName = "Ashutosh";
    int unitsConsumed = 182;
    int pricePerUnit;
    int finalBill;

    public void calcElectricityBill(){
        if(unitsConsumed>0 && unitsConsumed<100){
            finalBill = 3*unitsConsumed;
        } else if (unitsConsumed>=100 && unitsConsumed<300){
            finalBill = (100*3)+((unitsConsumed-100)*5);
        }else {
            finalBill = (100*3)+(100*5)+(unitsConsumed-200)*8 ;
        }
    }

    public void dispBill(){
        System.out.println("Consumer Name: "+consumerName);
        System.out.println("Units Consumed: "+unitsConsumed);
        System.out.println("Final Bill: "+finalBill);
    }
}

public class BasicElectricityBill {
    public static void main(String[] args) {
         Electricity obj =new User();

         obj.calcElectricityBill();
         obj.dispBill();

    }
}
