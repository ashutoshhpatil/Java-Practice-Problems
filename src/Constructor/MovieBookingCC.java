package Constructor;

class MovieTicket{
    String movieName;
    String seatType;
    int numberOfTickets;
    boolean includesSnacks;

    MovieTicket(){
        this("Avengers","Regular",1,true);
    }

    MovieTicket(String movieName){
        this(movieName,"Luxury",5,true);
    }

    MovieTicket(String movieName,String seatType){
        this(movieName,seatType,2,true);
    }

    MovieTicket(String movieName, String seatType, int numberOfTickets, boolean includesSnacks){
        this.movieName=movieName;
        this.seatType=seatType;
        this.numberOfTickets=numberOfTickets;
        this.includesSnacks=includesSnacks;

        System.out.println("Movie Name: "+movieName);
        System.out.println("Seat Type: "+seatType);
        System.out.println("No of Tickets: "+numberOfTickets);
        System.out.println("Snacks Included: "+includesSnacks);
    }
}

public class MovieBookingCC {
    public static void main(String[] args) {
        MovieTicket m1 = new MovieTicket();
        MovieTicket m2 = new MovieTicket("BlackWood");
        MovieTicket m3 = new MovieTicket("WhiteWood","Luxury");
    }
}
