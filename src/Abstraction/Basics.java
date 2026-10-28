package Abstraction;

abstract  class Vehicle{
    String vehicleType;
    int price;

    public abstract int getWheelsInfo();

    public abstract void dispDetails();

}

class Bike extends Vehicle{
    {
        vehicleType = "Bike";
        price = 45000;
    }

    @Override
    public int getWheelsInfo() {

        return 2;
    }
    public void dispDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Price: " + price);
        System.out.println("Number of Wheels: " + getWheelsInfo());
    }
}

class Car extends Vehicle{
    {
        vehicleType = "Car";
        price = 650000;
    }
    @Override
    public int getWheelsInfo() {

        return 4;
    }

    public void dispDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Price: " + price);
        System.out.println("Number of Wheels: " + getWheelsInfo());
    }
}

class Bus extends Vehicle{
    {
        vehicleType = "Bus";
        price = 1500000;
    }

    public int getWheelsInfo() {
        return 8;
    }

    public void dispDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Price: " + price);
        System.out.println("Number of Wheels: " + getWheelsInfo());
    }
}

public class Basics {
    public static void main(String[] args) {
        Bike obj1 = new Bike();
        Car obj2 = new Car();
        Bus obj3 = new Bus();

        obj1.getWheelsInfo();
        obj1.dispDetails();
        System.out.println("==================");


        obj2.getWheelsInfo();
        obj2.dispDetails();
        System.out.println("==================");

        obj3.getWheelsInfo();
        obj3.dispDetails();
        System.out.println("==================");

    }

}



