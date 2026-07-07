package Inheritance.HierarchicalInheritance;

class Railway{
    int trainNumber = 22144;
    int totalTicketFare;
    int noOfPassengers;
    int ticketPrice;
}

class Sleeper extends Railway{
    void calcFare(){

        ticketPrice=1000;
        noOfPassengers = 54;
        totalTicketFare = noOfPassengers*ticketPrice;
    }

    void dispSleeper(){
        System.out.println("Train Number: "+trainNumber);
        System.out.println("======Sleeper Class=====");
        System.out.println("No of Passengers: "+noOfPassengers);
        System.out.println("Ticket Price: "+ticketPrice);
        System.out.println("Total Bill: "+totalTicketFare);
    }
}

class AC extends Railway{
    void calcFare(){
        ticketPrice=2500;
        noOfPassengers = 30;
        totalTicketFare = noOfPassengers*ticketPrice;
    }

    void dispAC(){
        System.out.println("Train Number: "+trainNumber);
        System.out.println("======AC Class=====");
        System.out.println("No of Passengers: "+noOfPassengers);
        System.out.println("Ticket Price: "+ticketPrice);
        System.out.println("Total Bill: "+totalTicketFare);
    }
}
public class RailwayData {
    public static void main(String[] args) {
        Sleeper ss = new Sleeper();
        ss.calcFare();
        ss.dispSleeper();

        AC aa = new AC();
        aa.calcFare();
        aa.dispAC();
    }
}
