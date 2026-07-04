package Methods.Assignment1;

import ClassandObjects.ElectricityBill;

public class ElectricityBillManagement {
    String customerName;
    int meterNumber;
    int unitsConsumed;
    int ratePerUnit;
    int totalBill;

    void setCustomerDetails(String customerName, int meterNumber){
        this.customerName = customerName;
        this.meterNumber = meterNumber;
    }

    int getUnitsConsumed(){
        this.unitsConsumed = unitsConsumed;
        return unitsConsumed;
    }

    int calculateBill(int ratePerUnit){
        this.ratePerUnit = ratePerUnit;
        totalBill = unitsConsumed *ratePerUnit;

        return totalBill;
    }

    void displayDetails(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Meter Number: "+meterNumber);
        System.out.println("No of Units: "+unitsConsumed);
        System.out.println("Total Bill: "+totalBill);
    }

    public static void main(String[] args) {
        ElectricityBillManagement obj = new ElectricityBillManagement();
        obj.unitsConsumed = 25;
        obj.setCustomerDetails("Manisha",122124);
        obj.getUnitsConsumed();
        System.out.println(obj.calculateBill(10));
        obj.displayDetails();
    }
}
