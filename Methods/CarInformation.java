package Methods.Assignment1;

public class CarInformation {
    String carName;
    String brandName;
    int speed;
    int petrol = 10;

    void displayCar(){
        System.out.println("Car Name:" +carName);
    }

    void getCarDetails(String brandName, String model){
        this.brandName = brandName;
        System.out.println("Brand Name: "+brandName);
        System.out.println("Model Name:" +model);
    }

    int getSpeed(){
        this.speed = speed;
        System.out.println("Maximum Car Speed "+speed);
        return speed;
    }

    int petrolCapacity(int addPetrol){
        this.petrol = petrol;
        System.out.println("Initially the petrol is: "+petrol);
        petrol += addPetrol;
        System.out.println("After adding extra petrol: "+petrol);
        return petrol;
    }

    public static void main(String[] args) {
        CarInformation carInformation = new CarInformation();
        carInformation.carName = "MG Hector";
        carInformation.speed=180;
        carInformation.displayCar();
        carInformation.getCarDetails("MG","MG HECTOR 5687");
        carInformation.getSpeed();
        carInformation.petrolCapacity(15);
    }
}
