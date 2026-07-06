package Inheritance.Assignment1.MultilevelInheritance;

class Vehicle{
    String companyName = "Honda";

    int manfacYear = 2022;
}

class Bike extends  Vehicle{
    String modelName = " SP SHINE";
    int fuelCapacity = 16;

    void dispDetailsBike(){
        System.out.println("Company Name: "+companyName);
        System.out.println("Manufacturing Year: "+manfacYear);
        System.out.println("ModelName: "+modelName);
        System.out.println("Fuel Capacity: "+fuelCapacity);
    }
}

class SportsBike extends Bike{
    int distanceTravelled= 85;
    float mileage;
    int fuelConsumed = 14;

    void calcMileage(){
        mileage = (float) (distanceTravelled / fuelConsumed);
    }

    void dispSportsBike(){
        super.dispDetailsBike();
        System.out.println("Total Distance travelled: "+distanceTravelled);
        System.out.println("Fuel Consumed: "+fuelConsumed);
        System.out.println("Mileage: "+mileage);
    }
}
public class VehicleData {
    public static void main(String[] args) {
        SportsBike sb = new SportsBike();
        sb.calcMileage();
        sb.dispSportsBike();

    }
}
