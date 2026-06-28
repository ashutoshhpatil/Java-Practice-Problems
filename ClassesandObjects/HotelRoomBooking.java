package ClassandObjects;

import java.util.Scanner;

public class HotelRoomBooking {
    Scanner sc = new Scanner(System.in);
    String guestName;
    int roomNumber;
    String roomType;
    int roomPrice;
    int numberOfDays;
    int totalBill;
    String bookingStatus;
    String ans;


    void getInfo(){
        System.out.println("Enter Name:");
        guestName = sc.nextLine();
        System.out.println("Enter room type;");
        roomType = sc.nextLine();
        System.out.println("Enter number of days");
        numberOfDays = sc.nextInt();
    }
    void bookRoom(){
         if(roomType.equalsIgnoreCase("Standard")){
             roomPrice = 1500;
         }
         else if(roomType.equalsIgnoreCase("Deluxe")){
             roomPrice = 3000;
         }
         else if(roomType.equalsIgnoreCase("Suite")){
             roomPrice = 5500;
         }else{
             System.out.println("Inavlid Room Type");
         }
         totalBill = roomPrice*numberOfDays;
         bookingStatus = "Booked";
        System.out.println("Room Booked Sucesfully");
    }

    void extendStay(int extraDays){
        numberOfDays += extraDays;
        totalBill = roomPrice*numberOfDays;
        System.out.println("Stay extended by "+extraDays+ " days");
    }

    void cancelBooking(){
        if(bookingStatus.equals("Booked")){
            int cancellationCharge = (int)(totalBill*0.20f);

            System.out.println("Booking Cancelled");
            System.out.println("Cancellation Charge: "+cancellationCharge);
            bookingStatus = "Cancelled";
        }
    }

    void displayBookingDetails(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Price: ₹" + roomPrice);
        System.out.println("Number of Days: " + numberOfDays);
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Booking Status: " + bookingStatus);
    }

    public static void main(String[] args) {
        HotelRoomBooking hotelRoomBooking = new HotelRoomBooking();
        hotelRoomBooking.roomNumber = 456;
        hotelRoomBooking.getInfo();
        hotelRoomBooking.bookRoom();
        //hotelRoomBooking.extendStay(2);
        //hotelRoomBooking.cancelBooking();
        hotelRoomBooking.displayBookingDetails();

    }




}
