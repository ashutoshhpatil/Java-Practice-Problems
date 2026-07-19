package ClassandObjects;

interface WaterTank{
    void calcLevel();
    void dispStatus();
}

class SmartTank implements WaterTank{
   int tankCapacity = 1000;
   int currentWater = 950;
   int  inflow = 50;
   int outflow = 250;
   int  remainingWater;
   float percentage;
   String tankStatus;


   public void calcLevel(){
       remainingWater = currentWater +inflow-outflow;

       percentage = (float) (remainingWater*100)/tankCapacity;

       if(percentage>80)
           tankStatus = "Full";
       else if (percentage>=40)
           tankStatus = "Normal";
       else
           tankStatus= "Refill Needed";
   }

    public void dispStatus() {
        System.out.println("Tank Capacity: "+tankCapacity);
        System.out.println("Current Water: "+currentWater);
        System.out.println("Inflow: "+inflow);
        System.out.println("Outflow: "+outflow);
        System.out.println("Remaining: "+remainingWater);
        System.out.println("Water Percentage: "+percentage);
        System.out.println("Tank Status: "+tankStatus);
    }
}

public class WaterTankMonitoring {
    public static void main(String[] args) {
        WaterTank obj = new SmartTank();
        obj.calcLevel();
        obj.dispStatus();
    }
}
