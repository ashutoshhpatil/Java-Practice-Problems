package Inheritance.Assignment1.SingleLevelInheritance;

class ParkingLots{
    int totalLots = 20;
}

class SmartParking extends ParkingLots{
    String parkingStatus;
    int occupiedSlots;
    int availableSlots;

    void getDetails(){
        availableSlots = totalLots-occupiedSlots;

        if(availableSlots>0 && availableSlots<totalLots){
            parkingStatus = "Available";
        }else{
            parkingStatus = "Full";
        }
    }

    void dispDetails(){
        System.out.println("Total Slots: "+totalLots);
        System.out.println("Available Slots: "+availableSlots);
        System.out.println("Occupied Slots: "+occupiedSlots);
        System.out.println("Parking Status: "+parkingStatus);
    }
}

public class ParkingSlot {
    public static void main(String[] args) {
        SmartParking smp = new SmartParking();
        smp.occupiedSlots=20;
        smp.getDetails();
        smp.dispDetails();

    }
}
