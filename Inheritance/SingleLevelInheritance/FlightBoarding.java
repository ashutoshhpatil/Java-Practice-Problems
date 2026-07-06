
package Inheritance.Assignment1.SingleLevelInheritance;

class Flight{
    String flightNumber = "I89GH5" ;
    String Source = "Mumbai";
    String Destination = "Sydney";

    void dispDetails(){
        System.out.println("Flight Number: "+flightNumber);
        System.out.println("Source: "+Source);
        System.out.println("Destination: "+Destination);
    }
}

class BoardingPass extends Flight {
    String passengerName = "Ashutosh";
    int baggageWeight = 60;
    boolean visa = true;

    void getDetails() {
        if (baggageWeight <= 60 && visa) {
            System.out.println("Boarding: Allowed");
        } else {
            System.out.println("Boarding: Not Allowed");
        }
    }

    void dispDetails() {
        super.dispDetails();
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Baggage Weight: " + baggageWeight);
        if (visa) {
            System.out.println("Visa: Available");
        } else {
            System.out.println("Visa:Unavailable.....Boarding Not Allowed");
        }
    }
}
    public class FlightBoarding {
        public static void main(String[] args) {
            BoardingPass bp = new BoardingPass();
            bp.getDetails();
            bp.dispDetails();

        }
    }
