package ClassandObjects;

public class TrainTicket {
    String passengerName;
    int age;
    double fare;
    String seatNo;
    double discount = 0.30;
    double Discount;


    void bookTicket(){

        System.out.println( "The Total fare is "+fare);
        if(age>=60){
            Discount = (fare * discount);
            System.out.println("The Discount Amount is:" +Discount );
        }
    }

    void displayTicket(){
        System.out.println("Passenge Name: "+passengerName);
        System.out.println("Age: "+age);
        System.out.println("Total Fare: "+(fare-Discount));
        System.out.println("Seat No: " +seatNo);
    }

    public static void main(String[] args) {
        TrainTicket tt = new TrainTicket();
        tt.passengerName = "Madhav";
        tt.age = 75;
        tt.fare = 675;
        tt.seatNo = "24 U";
        tt.bookTicket();
        tt.displayTicket();
    }
}
