package Abstraction;

abstract class TollPlaza{
    String vehicleNumber;
    String ownerName;
    int vehicleWeight;
    int tollAmount;
    int gstAmount;
    int finalAmount;
    String vehicleStatus;
    boolean checkToll;
    String tollStatus;

    abstract void calcToll();

    void generateReceipt(){
        finalAmount = tollAmount+gstAmount;
    }

    void checkVehicle(){
        if(vehicleWeight>1000){
            vehicleStatus = "Heavy";
        } else if (vehicleWeight>=500){
            vehicleStatus = "Medium";
        }else {
            vehicleStatus = "Normal";
        }

        if(vehicleStatus.equalsIgnoreCase("Heavy")){
            tollAmount = 1250;
            gstAmount = 250;

        } else if (vehicleStatus.equalsIgnoreCase("Medium")) {
            tollAmount = 700;
            gstAmount = 150;
        }else {
            tollAmount = 450;
            gstAmount = 100;
        }

        if(checkToll){
             tollStatus = "Paid";
        }else {
            tollStatus = "Unpaid";
        }
    }

    void dispVehicle(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Vehicle Status: "+vehicleStatus + ";Vehicle Weight: " +vehicleWeight);
        System.out.println("Toll Amount: "+tollAmount);
        System.out.println("GST Amount: "+gstAmount);
        System.out.println("Final Payable Amount: "+finalAmount);

        if(tollStatus.equalsIgnoreCase("Paid")){
            System.out.println("--->Toll Paid....You can Go");
        }else {
            System.out.println("--->Stop....Toll not Paid");
        }
    }
}

class Vehicle1 extends TollPlaza{
    {
        vehicleNumber = "MH 24 AP 1199";
        ownerName = "Sathish Kadam";
        vehicleWeight = 5666;
        checkToll = false;
    }

    @Override
    void calcToll() {
        checkVehicle();
        generateReceipt();
        dispVehicle();
    }
}

class Vehicle2 extends TollPlaza{
    {

        vehicleNumber = "MH 42 AP 1199";
        ownerName = "Sathish K";
        vehicleWeight = 1996;
        checkToll = true;
    }

    @Override
    void calcToll() {
        checkVehicle();
        generateReceipt();
        dispVehicle();
    }
}

class Vehicle3 extends TollPlaza{
    {
        vehicleNumber = "KA 23 AS 1234";
        ownerName = "K ANNAMALAI";
        vehicleWeight = 5602;
        checkToll = true;
    }

    @Override
    void calcToll() {
        checkVehicle();
        generateReceipt();
        dispVehicle();
    }
}


public class TollPlazaManagement {
    public static void main(String[] args) {
        TollPlaza obj;
        obj = new Vehicle1();
        obj.calcToll();
        System.out.println("------------------------------");

        obj = new Vehicle2();
        obj.calcToll();
        System.out.println("------------------------------");

        obj = new Vehicle3();
        obj.calcToll();
        System.out.println("------------------------------");

    }

}
