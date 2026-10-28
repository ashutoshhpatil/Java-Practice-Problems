package ClassandObjects;

import java.util.Scanner;

public class MovieTicketBooking {
    Scanner sc = new Scanner(System.in);
    int ticketprice;
    String customerName;
    String movieName;
    int tickets;
    float totalAmount;
    float finalAmount;
    float discount = 0.10f;

    void getDetails() {
        System.out.println("Enter Customer Name:");
        customerName = sc.nextLine();
        System.out.println("Which Movie:");
        movieName = sc.nextLine();
        System.out.println("How many tickets:");
        tickets = sc.nextInt();
    }

    void bookTickets(){
        if(tickets>5){
            totalAmount = ticketprice*tickets;
            float discountedAmount = totalAmount-(totalAmount*discount);
            finalAmount =discountedAmount;
            System.out.println("10% Discount Applied");
        }
        else{
            totalAmount = tickets*ticketprice;
        }

        if(totalAmount>3000){
            System.out.println("Additional 10% discount applied ... Total 20% Discount");
            finalAmount = finalAmount-(finalAmount*0.10f);
        }
    }

    void displayTicket(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Movie Name: "+movieName);
        System.out.println("Ticket Price: "+ticketprice);
        System.out.println("No of Tickets: "+tickets);
        System.out.println("Total Amount: "+totalAmount);
        System.out.println("Final Amount " + finalAmount);

    }


    public static void main(String[] args) {
        MovieTicketBooking movieTicketBooking = new MovieTicketBooking();
        movieTicketBooking.ticketprice = 250;
        movieTicketBooking.getDetails();
        movieTicketBooking.bookTickets();
        movieTicketBooking.displayTicket();
    }

}
