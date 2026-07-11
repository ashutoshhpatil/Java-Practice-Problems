package Inheritance;

interface Diagnosable{
    void runDiagnostics();
}

class Machine {
    String machineID;
    boolean powerStatus;
    static int totalMachines;

    void setMachineID() {
       powerStatus =true;
       System.out.println(machineID+ " is Powered ON");
       totalMachines++;

    }

    void setTotalMachines(){
        System.out.println("Total No of Machines: "+totalMachines);
    }
}

class RoboticArm extends Machine {
    double reach;
    double currentX, currentY, currentZ;
    double distance;

    void setReach(double reach) {
        this.reach = reach;
    }

    void distanceTo(double X, double Y, double Z) {
        distance = Math.sqrt(
                (X - currentX) * (X - currentX) + (Y - currentY) * (Y - currentY) + (Z - currentZ) * (Z - currentZ)
        );

        if (distance > reach) {
            System.out.println("ERROR: Target out of reach!");
        } else {
            currentX = X;
            currentY = Y;
            currentZ = Z;

            System.out.println("Arm moved to (" + X + ", " + Y + ", " + Z + ")");
        }
    }
}

class ConveyerArm  extends RoboticArm{
    double beltSpeed;
    int itemTransferred=0;

    void setBeltSpeed(double beltSpeed){
        this.beltSpeed=beltSpeed;
    }

    void distanceTo(double X, double Y, double Z){
        super.distanceTo(X, Y, Z);
        itemTransferred++;
        System.out.println("Item transferred. Total items: " + itemTransferred);
    }
}

class WeldingArm extends  RoboticArm implements Diagnosable{
    double weldTemp ;
    int weldCount;

    void setWeldTemp(double weldTemp){
        this.weldTemp = weldTemp;
    }

    void weld(){
        weldCount++;
        System.out.println("Weld #" + weldCount + " completed at " + weldTemp + "°C");

    }

    @Override
    public void runDiagnostics() {
        if(weldTemp<100 || weldTemp>800){
            System.out.println("WARNING : Unsafe Welding Temperature");
        }else {
            System.out.println("Diagnostics OK: Welding temperature safe.");
        }
    }
}


public class FactoryManagement {
    public static void main(String[] args) {
        ConveyerArm ca = new ConveyerArm();
        WeldingArm wa = new WeldingArm();

        ca.setBeltSpeed(2.5);
        ca.machineID = "CA1";
        ca.reach = 5.0;

        wa.machineID ="WA1";
        wa.reach = 3.0;
        wa.weldTemp = 450.0;

        ca.setMachineID();
        wa.setMachineID();

        ca.distanceTo(3,4,0);
        wa.distanceTo(10,10,10);
        wa.weld();
        wa.weld();

        wa.runDiagnostics();













        System.out.println("Total No of Machines: "+Machine.totalMachines);
    }


}
