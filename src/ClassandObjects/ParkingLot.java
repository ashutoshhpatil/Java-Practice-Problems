package ClassandObjects;

import java.util.Scanner;

public class ParkingLot {
    Scanner sc = new Scanner(System.in);
    String vehicleNumber;
    String vehicleType;
    int parkingHours;
    int parkingFee;
    int parkingBill;
    String parkingStatus;

    void getDetails(){
        System.out.println("Enter Vehicle Type: ");
        vehicleType = sc.nextLine();
        System.out.println("Enter vehicle number: ");
        sc.nextLine();
        vehicleNumber = sc.nextLine();
        System.out.println("For how many hours the vehicle is parked: ");
        parkingHours = sc.nextInt();
    }

    void parkVehicle(){
        if(vehicleType.equalsIgnoreCase("Bike")){
            parkingFee = 100;
        } else if (vehicleType.equalsIgnoreCase("Car")) {
            parkingFee = 200;
        }else if(vehicleType.equalsIgnoreCase("Bus")){
            parkingFee = 300;
        }else if(vehicleType.equalsIgnoreCase("Heavy Vehicles")){
            parkingFee = 450;
        }else{
            System.out.println("Parking Not Available for this tyoe of vehicle");
        }

        parkingBill = parkingFee*parkingHours;
        parkingStatus = "Parked";
    }

    void extendParking(int extraHours){
        if(parkingStatus.equalsIgnoreCase("Parked")){
            parkingHours += extraHours;

            parkingBill = parkingFee * parkingHours;

            System.out.println("Extended Parking Fees: "+parkingBill);
        }
    }

    void removeVehicle(){
        if(parkingStatus.equalsIgnoreCase("Parked")){
            System.out.println("Total Parking Fee: "+parkingBill);
            parkingStatus = "Removed Vehicle";
        }
    }

    void displayParkingDetails(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Parking Hours: "+parkingHours);
        System.out.println("Parking Fee: "+parkingBill);
        System.out.println("Parking Status: "+parkingStatus);
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.getDetails();
        parkingLot.parkVehicle();
        parkingLot.extendParking(2);
        parkingLot.displayParkingDetails();
        parkingLot.removeVehicle();
        parkingLot.displayParkingDetails();
        parkingLot.sc.close();
    }
}
