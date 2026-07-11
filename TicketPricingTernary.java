package Operators;

public class TicketPricingTernary {
    int age;
    double ticketPrice;
    double totalPrice;

    void getInfo(){
        totalPrice = (age<=12) ?(ticketPrice-(0.50*ticketPrice))
                :(age>12 && age <=60)?(ticketPrice)
                :(age>60 && age<80) ?(ticketPrice-(0.30*ticketPrice))
                :(age>=80) ? 0:0;

        System.out.println("Age: "+age+" ,Ticket Price "+totalPrice);
    }

    public static void main(String[] args) {
        TicketPricingTernary obj = new TicketPricingTernary();
        obj.age = 61;
        obj.ticketPrice = 1250;
        obj.getInfo();



    }
}
