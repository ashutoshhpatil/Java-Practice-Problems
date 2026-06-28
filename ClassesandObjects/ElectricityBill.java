package ClassandObjects;

public class ElectricityBill {
    String customerName;
    int customerID;
    int unitsConsumed;
    float billAmount;

    void calculateBill(int unitsConsumed){
        this.unitsConsumed = unitsConsumed;
        if(unitsConsumed >0 && unitsConsumed <=100){
            billAmount = 5 * unitsConsumed;
        }
        else if(unitsConsumed>=101 && unitsConsumed<=200){
            billAmount = (100*5)+((unitsConsumed-100)*7);
        }
        else if(unitsConsumed > 200){
            billAmount = (100*5)+(100*7)+((unitsConsumed-200)*10);
        }
    }

    void displayBill(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("CustomerId: "+customerID);
        System.out.println("No of Units: "+unitsConsumed);
        if (billAmount > 3000) {
            billAmount = billAmount+(billAmount*0.3f);
            System.out.println("Extra Surcharge Applied");
        }
        System.out.println("Total Bill: "+billAmount);


    }

    public static void main(String[] args) {
        ElectricityBill electricityBill = new ElectricityBill();
        electricityBill.customerName = "Rakesh";
        electricityBill.customerID = 12546;
        electricityBill.calculateBill(1530);
        electricityBill.displayBill();
    }
}