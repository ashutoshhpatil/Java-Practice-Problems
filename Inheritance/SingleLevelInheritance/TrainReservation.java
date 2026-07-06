package Inheritance.Assignment1.SingleLevelInheritance;

class Train{
    int trainNumber = 22144;
    String trainName = "CSMT BIDAR SF";
    String sourceStation = "Pune";
    String destinationStation = "Latur";
    int totalSeats = 400;
    int ticketPrice = 250;
    int occupiedSeats = 336;
}

class Reservation extends Train{
    String passengerName = "Ashutosh";
    int passengerAge= 22;
    int passengersCount = 4;
    int availableSeats;
    int waitingListCount;
    int totalFare;
    String reservationStatus;

    void reservation(){
        availableSeats = totalSeats-occupiedSeats;
        totalFare = passengersCount*ticketPrice;

        if(availableSeats>0 && availableSeats<totalSeats){
            reservationStatus = "Available";
        }else {
            reservationStatus = "Waitlisted";
        }
            waitingListCount = Math.abs(totalSeats-occupiedSeats);
    }

    void dispDetails(){
        System.out.println("passenger Name: "+passengerName);
        System.out.println("Age:"+passengerAge);
        System.out.println("No of Passengers: "+passengersCount);
        System.out.println("Train Name: "+trainName);
        System.out.println("Train Number: "+trainNumber);
        System.out.println("Source Station: "+sourceStation);
        System.out.println("Destination Station: "+destinationStation);
        System.out.println("Ticket Per Passenger: "+ticketPrice);
        System.out.println("Total Fare: "+totalFare);
        System.out.println("Reservation Status: "+reservationStatus);
        if(reservationStatus.equals("Waitlisted")) {
            System.out.println("Waitlist Count: " + waitingListCount);
        }else {
            System.out.println("Available Seats: "+availableSeats);
        }
    }
}

public class TrainReservation {
    public static void main(String[] args) {
        Reservation res = new Reservation();
        res.reservation();
        res.dispDetails();

    }
}
