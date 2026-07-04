package Methods.Assignment1;

public class FuelConsumption {
    String vehicleNumber;
    String modelName;
    int distanceTravelled;
    int fuelUsed;
    double mileage;

    void setVehicledetails(String vehicleNumber, String modelName,int distanceTravelled){
        this.vehicleNumber= vehicleNumber;
        this.modelName=modelName;
        this.distanceTravelled=distanceTravelled;
    }

    double getFuelUsed(){
        return fuelUsed;
    }

    double calcMileage( int fuelUsed){
        this.fuelUsed=fuelUsed;
        mileage = (double) distanceTravelled/fuelUsed;
        return mileage;
    }

    void dispDetails(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Model Name: "+modelName);
        System.out.println("Distance Travelled: "+distanceTravelled);
        System.out.println("Fuel Used: "+fuelUsed);
        System.out.println("Mileage: "+mileage);
    }

    public static void main(String[] args) {
        FuelConsumption fuelConsumption = new FuelConsumption();
        fuelConsumption.setVehicledetails("MH 24 BM 4319 ","Honda Activa",450);
        fuelConsumption.getFuelUsed();
        fuelConsumption.calcMileage(60);
        fuelConsumption.dispDetails();
    }
}
