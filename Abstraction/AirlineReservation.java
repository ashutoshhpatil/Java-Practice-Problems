package Abstraction;

abstract class Airline{
    String airlineName = "Emirates",source = "Mumbai",destination = "Dubai",passengerName,seatType,mealStatus;
    float ticketPrice,baggageCharge,mealCharge,gst,gstAmount,finalFare;
    int flightNumber = 56894, baggageWeight,baggageAllowed,extraBaggage;

    abstract void calcBaggageCharge();
    abstract void mealCharge();
    abstract  void calcGST();
    abstract void generateTicket();
    void dispTicket() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Airline Name: " + airlineName);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Seat Type: " + seatType);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Baggage Weight: " + baggageWeight + " kg");
        System.out.println("Baggage Allowed: " +baggageAllowed + " kg");
        System.out.println("Extra Baggage: " + extraBaggage + " kg");
        System.out.println("Baggage Charge: " + baggageCharge);
        System.out.println("Meal Status: " + mealStatus);
        System.out.println("Meal Charge: " + mealCharge);
        System.out.println("GST: " + gst+ " %");
        System.out.println("GST Amount: " + gstAmount);
        System.out.println("Final Fare: " + finalFare);
    }
}

class Economy extends Airline{
    {
        passengerName = "Aditya";
        seatType = "Economy";
        ticketPrice = 5000;
        baggageWeight = 45;
        baggageAllowed = 15;
        mealStatus = "Included";
        gst = 0.05f;
    }

    void calcBaggageCharge() {
        if(baggageWeight>baggageAllowed){
            baggageCharge =300;
            extraBaggage = baggageWeight-baggageAllowed;

        }else {
            extraBaggage =0;
            baggageCharge = 0;
        }

    }

    void mealCharge() {
        if(mealStatus.equalsIgnoreCase("Included")){
            mealCharge = 250;
        }else {
            mealCharge = 0;
        }
    }

    void calcGST() {
        gstAmount = ticketPrice*gst;
    }

    void generateTicket() {
        finalFare = ticketPrice+gstAmount+mealCharge+baggageCharge;
    }
    }

class BusinessClass extends Airline{
    {
        passengerName = "Ashutosh";
        seatType = " BusinessClass";
        ticketPrice = 15000;
        baggageWeight = 38;
        baggageAllowed = 30;
        mealStatus = "Not Included";

        gst = 0.12f;
    }

    void calcBaggageCharge() {
        if(baggageWeight>baggageAllowed){
            baggageCharge =500;
            extraBaggage = baggageWeight-baggageAllowed;
        }else {
            extraBaggage = 0;
            baggageCharge = 0;
        }

    }


    void mealCharge() {
        if(mealStatus.equalsIgnoreCase("Included")){
            mealCharge = 700;
        }else {
            mealCharge = 0;
        }
    }


    void calcGST() {
        gstAmount = ticketPrice*gst;
    }

    void generateTicket() {
        finalFare = ticketPrice+gstAmount+mealCharge+baggageCharge;
    }
}

class FirstClass extends Airline{
    {
        passengerName = "Sharvari";
        seatType = "FirstClass";
        ticketPrice = 30000;
        baggageWeight = 45;
        baggageAllowed = 40;
        mealStatus = "Included";

        gst = 0.05f;
    }


    void calcBaggageCharge() {
        if(baggageWeight>baggageAllowed){
            baggageCharge =700;
            extraBaggage = baggageWeight-baggageAllowed;
        }else {
            extraBaggage = 0;
            baggageCharge = 0;
        }

    }


    void mealCharge() {
        if(mealStatus.equalsIgnoreCase("Included")){
            mealCharge = 1500;
        }else {
            mealCharge = 0;
        }
    }


    void calcGST() {
        gstAmount = ticketPrice*gst;
    }


    void generateTicket() {
        finalFare = ticketPrice+gstAmount+mealCharge+baggageCharge;
    }
}

    public class AirlineReservation {
    public static void main(String[] args) {
//        Airline obj = new Economy();
//        obj.calcBaggageCharge();
//        obj.calcGST();
//        obj.mealCharge();
//        obj.generateTicket();
//        obj.dispTicket();

        Airline obj = new BusinessClass();
        obj.calcBaggageCharge();
        obj.calcGST();
        obj.mealCharge();
        obj.generateTicket();
        obj.dispTicket();
    }
}
