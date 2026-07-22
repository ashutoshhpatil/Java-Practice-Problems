package Abstraction;

import java.util.Scanner;

interface ParkingEntry{
    void verifyVehicle();
    void allocateSlot();
}

interface ParkingCharge{
    void calcParking();
}

interface PaymentClass{
    void makePayment();
    void generateReceipt();
}

interface ExitGate{
    void releaseSlot();

}

class SmartParkingEntry implements ParkingEntry{
    Scanner sc = new Scanner(System.in);
    String parkId;
    String vehicleNum;
    String ownerName;
    String vehicleType;
    int parkingHours;
    String slotNumber;
    float parkingCharge;
    float discount;
    float discountedAmount;
    float gst;
    float gstAmount;
    float finalAmount;
    String paymentMode;

    int bikeSlots = 20;
    int carSlots = 10;
    static int bikeSlotNumber = 101;
    static int carSlotNumber = 101;
    static int parkIdNumber=10;

    @Override
    public void verifyVehicle() {


        System.out.println("Enter Owner Name: ");
        ownerName = sc.nextLine();

        System.out.println("Enter Vehicle Number:");
        vehicleNum = sc.nextLine();
        if(vehicleNum.length()!=10){
            System.out.println("Invalid Vehicle Number");
            System.exit(0);
        }

        if(Character.isLetter(vehicleNum.charAt(0))&&
           Character.isLetter(vehicleNum.charAt(1))&&
           Character.isDigit(vehicleNum.charAt(2))&&
                Character.isDigit(vehicleNum.charAt(3))&&
                Character.isLetter(vehicleNum.charAt(4))&&
                Character.isLetter(vehicleNum.charAt(5))&&
                Character.isDigit(vehicleNum.charAt(6))&&
                Character.isDigit(vehicleNum.charAt(7))&&
                Character.isDigit(vehicleNum.charAt(8))&&
                Character.isDigit(vehicleNum.charAt(9))){
            System.out.println("Vehicle Verified Successfully");
        }else{
            System.out.println("Invalid Vehicle Number");
            System.exit(0);
        }
    }

    @Override
    public void allocateSlot() {


        System.out.println("Enter Vehicle Type: ");
        vehicleType = sc.next();

        if(vehicleType.equalsIgnoreCase("Bike")) {
            if (bikeSlots <= 0) {
                System.out.println("No Slots Available");
            } else {
                System.out.println("Slot Alloted Successfully");
                 bikeSlots--;
                 slotNumber = "B"+bikeSlotNumber++;
                System.out.println("Remaining Bike Slots: "+bikeSlots);
            }
        }

        else if(vehicleType.equalsIgnoreCase("Car")) {
            if (carSlots <= 0) {
                System.out.println("No Slots Available");
            } else {
                System.out.println("Slot Alloted Successfully");
                carSlots--;
                slotNumber = "C"+carSlotNumber++;
                System.out.println("Remaining Car Slots: "+carSlots);
            }
        }
        else
        {
            System.out.println("Invalid Vehicle Type");
            System.exit(0);
        }

    }
}


class SmartParkingCharge extends SmartParkingEntry implements ParkingCharge, PaymentClass,ExitGate{
    @Override
    public void calcParking() {
        System.out.println("Enter Parking Hours: ");
        parkingHours =sc.nextInt();

        if(vehicleType.equalsIgnoreCase("Bike"))
            parkingCharge = parkingHours* 50;
        else if (vehicleType.equalsIgnoreCase("Car"))
            parkingCharge =parkingHours* 100;
        else {
            System.out.println("Invalid Vehicle Type");
        }

        if(parkingHours>10){
            discount = 0.10f;
            discountedAmount = discount*parkingCharge;
        }else {
            discountedAmount = 0;
        }

        gst = 0.18f;
        gstAmount = gst*parkingCharge;

        finalAmount = parkingCharge+gstAmount-discountedAmount;
    }
    @Override
    public void makePayment() {
       int paymentChoice;

        System.out.println("1.UPI");
        System.out.println("2.Card");
        System.out.println("3.Cash");

        System.out.println("Choose Payment Mode: ");
        paymentChoice = sc.nextInt();

        switch (paymentChoice){
            case 1:
                paymentMode ="UPI";
                break;

            case 2:
                paymentMode = "Card";
                 break;

            case 3:
                paymentMode = "Cash";
                break;

            default:
                System.out.println("Invalid Payment Mode");
                System.exit(0);
        }

        System.out.println("Final payable Amount: "+finalAmount);
        System.out.println("Payment Successfull through: "+paymentMode);
    }

    public void generateReceipt() {



        parkId = "P"+parkIdNumber++;
        System.out.println("\n======================================");
        System.out.println("        SMART PARKING RECEIPT");
        System.out.println("======================================");

        System.out.println("Parking ID      : " + parkId);
        System.out.println("Owner Name      : " + ownerName);
        System.out.println("Vehicle Number  : " + vehicleNum);
        System.out.println("Vehicle Type    : " + vehicleType);
        System.out.println("Slot Number     : " + slotNumber);
        System.out.println("Parking Hours   : " + parkingHours);
        System.out.println("Parking Charge  : ₹" + parkingCharge);
        System.out.println("Discount        : ₹" + discountedAmount);
        System.out.println("GST             : ₹" + gstAmount);
        System.out.printf("Final Amount    : ₹%.2f%n", finalAmount);
        System.out.println("Payment Mode    : " + paymentMode);

        System.out.println("--------------------------------------");
        System.out.println("Status          : PAID");
        System.out.println("Thank You! Visit Again.");
        System.out.println("======================================");
    }

    @Override
    public void releaseSlot() {
        if(vehicleType.equalsIgnoreCase("Bike")){
            bikeSlots++;
        } else if (vehicleType.equalsIgnoreCase("Car")){
            carSlots++;
        }
        System.out.println("Slot Released Successfully");
    }

}

 public class ParkingManagement {
    public static void main(String[] args) {
        SmartParkingCharge obj = new SmartParkingCharge();
         obj.verifyVehicle();
        obj.allocateSlot();
        obj.calcParking();
        obj.makePayment();
        obj.generateReceipt();
        obj.releaseSlot();

    }
}
