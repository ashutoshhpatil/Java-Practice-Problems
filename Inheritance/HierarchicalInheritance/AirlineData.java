package Inheritance.HierarchicalInheritance;

class Airline{
    String source;
    String destination;
    int baggageWeight;
}

class Domestic extends Airline{
    boolean aadharAvailable = false;

    boolean checkDomestic(){
        source = "Mumbai";
        destination = "Delhi";
        baggageWeight = 35;
        if(aadharAvailable && baggageWeight<30){
            return true;
        }else {
            return false;
        }
    }

    void dispDomestic(){
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
        System.out.println("Baggage Weight: "+baggageWeight);
        if(true)
            System.out.println("Eligible for Boarding");
        else
            System.out.println("Not Eligible for Boarding");

        if(!(aadharAvailable)){
            System.out.println("-->Due to unavailability of Aadhar");
        }
        if(baggageWeight>30){
            System.out.println("-->Due to Excess Baggage Weight");
        }
    }
}

class International extends Airline{
    boolean passPort =  false;
    boolean visa = false;

    void dispInternational(){
        source = "Mumbai ";
        destination ="Singapore";
        baggageWeight = 65;
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
        System.out.println("Baggage Weight: "+baggageWeight);

        if(passPort && visa && baggageWeight<60){
            System.out.println("Eligible for Boarding");
        }else {
            System.out.println("Not Eligible for Boarding");

            if(!(passPort)){
                System.out.println("-->Due to unavailability of passport");
            }
            if(!(visa)){
                System.out.println("-->Due to unavailability of visa");
            }
            if(baggageWeight>60){
                System.out.println("-->Due to Excess Baggage Weight");
            }
        }



    }
}
public class AirlineData {
    public static void main(String[] args) {
        Domestic dd = new Domestic();
        dd.checkDomestic();
        dd.dispDomestic();

        System.out.println("======================");

        International ii = new International();
        ii.dispInternational();

    }
}
