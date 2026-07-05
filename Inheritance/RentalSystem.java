    package Inheritance;

    import java.util.Scanner;

    class Vehicle {
        Scanner sc = new Scanner(System.in);
        String vehicleNumber;
        String model;
        String brand;
        int noofDays;
        int capacity;
        String fuelType;
        int totalCost;
        int gst;
        int carRent;
        int engineCapacityCC;

        void getDetails() {
            System.out.println("Enter Vehicle Number:");
            vehicleNumber = sc.nextLine();
            System.out.println("Enter Brand: ");
            brand = sc.nextLine();
            System.out.println("Enter Model Name: ");
            model = sc.nextLine();
            System.out.println("Enter no of Days: ");
            noofDays = sc.nextInt();
        }

        void dispDetails() {
            System.out.println("Vehicle Number: " + vehicleNumber);
            System.out.println("Model Name: " + model);
            System.out.println("Brand Name: " + brand);
            System.out.println("No of Days: " + noofDays);
        }
    }

    class Car extends Vehicle{
            void getDetailsCar() {
                super.getDetails();
                System.out.println("Enter Seating Capacity: ");
                capacity = sc.nextInt();
                System.out.println("Enter Fuel type");
                fuelType = sc.next();
            }

            void rentRules(){
                if(noofDays >5 && capacity == 7 && fuelType.equalsIgnoreCase("Petrol")){
                    carRent = 250;
                }
                else if(noofDays >5 && capacity == 7 && fuelType.equalsIgnoreCase("Diesel")){
                    carRent = 230;
                }
                else if(noofDays>5 && capacity == 5){
                    carRent = 270;
                }
                else{
                    carRent = 300;
                }
                carRent *= noofDays;

                gst = (int)(carRent*0.07);
                totalCost = carRent+ gst;
            }

            void dispCarDetails(){
                super.dispDetails();

                System.out.println("Seating Capacity: "+capacity);
                System.out.println("Fuel Type: "+fuelType);
                System.out.println("Car Rent: "+carRent);
                System.out.println("GST AMOUNT: "+gst);
                System.out.println("Total Rent: "+totalCost);
            }
        }

        class Bike extends Vehicle{
        int bikeRent;
        boolean helmetIncluded;
        void getBikeDetails(){
            super.getDetails();
            System.out.println("Enter engine capacity:");
            engineCapacityCC = sc.nextInt();
            System.out.println("Helemt Included: ");
            helmetIncluded = sc.nextBoolean();
            if(engineCapacityCC >= 1000 && helmetIncluded){
                bikeRent = 250;
            }else if(engineCapacityCC>=1000){
                bikeRent = 200;
            }
            else if(engineCapacityCC<1000 && helmetIncluded){
                bikeRent = 150;
            }else {
                bikeRent = 100;
            }
            totalCost = bikeRent*noofDays;
        }

        void dispBikeDetails(){
            super.dispDetails();
            System.out.println("Engine Capacity: "+engineCapacityCC);
            System.out.println("Is Helmet Include: "+helmetIncluded);
            System.out.println("Total Rent: "+totalCost);
        }
        }

    class Truck extends Vehicle{
        int load;
        boolean isDriverNeeded;
        int truckRent;
        void getDetailsTruck(){
            super.getDetails();
            System.out.println("Enter Load Weight: ");
            load = sc.nextInt();
            System.out.println("Is Driver required: ");
            isDriverNeeded = sc.nextBoolean();
        }

        void rentRulesTruck(){
            truckRent = 2000;
            if(isDriverNeeded){
                truckRent = truckRent+1000;
            }
            if(load>=5000){
                truckRent += 5000;
            }
            totalCost = truckRent*noofDays;
            gst = (int)(totalCost*0.18);
            totalCost += gst;
        }

        void dispTruckDetails(){
            super.dispDetails();
            System.out.println("Load Weight: "+load);
            System.out.println("Is Driver Required: "+isDriverNeeded);
            System.out.println("GST Amount: "+gst);
            System.out.println("Total Rent: "+totalCost);
        }
    }

    public class RentalSystem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int choice;
                System.out.println("-----------Vehicle Rental System--------");
                System.out.println("1.Car");
                System.out.println("2.Bike");
                System.out.println("3.Truck");
            System.out.println("Enter Choice for Vehicle Rental");
                choice = sc.nextInt();

                switch (choice){
                    case 1:
                        Car car = new Car();
                        car.getDetailsCar();
                        car.rentRules();
                        car.dispCarDetails();
                        break;

                    case 2:
                        Bike bike = new Bike();
                        bike.getBikeDetails();
                        bike.dispBikeDetails();
                        break;

                    case 3:
                        Truck truck = new Truck();
                        truck.getDetailsTruck();
                        truck.rentRulesTruck();
                        truck.dispTruckDetails();
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
        }
    }
