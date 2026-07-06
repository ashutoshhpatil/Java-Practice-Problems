package Inheritance.Assignment1.SingleLevelInheritance;

class User{
    String consumerName = "Ashutosh";
    int consumerID = 564578;
    int meterNumber = 654;
}

class ElectricityBill extends  User{
    int unitsConsumed = 189;
    int unitRate = 8;
    int billAmount;
    float gst = 0.14f;
    int finalBill;

    void getDetails(){
        billAmount = unitsConsumed*unitRate;
        gst = (int)(billAmount*gst);
        finalBill = billAmount+(int)(gst);
    }

    void dispDetails(){
        System.out.println("Consumer Name: "+consumerName);
        System.out.println("Consumer ID: "+consumerID);
        System.out.println("Meter Number: "+meterNumber);
        System.out.println("Units Consumed: "+unitsConsumed);
        System.out.println("Per Unit Rate: "+unitRate);
        System.out.println("Bill Amount: "+billAmount);
        System.out.println("GST: "+gst);
        System.out.println("Final Bill : "+"Rs "+finalBill);

    }
}

public class ElectricityBoard {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();
        eb.getDetails();
        eb.dispDetails();

    }
}
