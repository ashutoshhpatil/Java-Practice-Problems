package Polymorphism.Overriding;

class Vehicle{
    String vehicleName;
    String chasisNo;
    int cost;

    void service(){
        System.out.println("Service Station Open");
        System.out.println("Vehicle Name: "+vehicleName);
        System.out.println("Chasis No: "+chasisNo);
        System.out.println("Cost for Servicing: "+cost);

    }
}

class Bike extends Vehicle{
    {
        vehicleName = "Bike";
        chasisNo = "AS7895";
        cost = 2500;
    }

    @Override
    void service() {
        int noOfWheels = 2;
        super.service();
        System.out.println("No of Wheels: "+noOfWheels);
    }
}

public class VehicleService {
    public static void main(String[] args) {
        Vehicle obj = new Bike();
        obj.service();
    }
}
