package ClassandObjects;
import java.util.*;
public class PatientBillingSystem {
    Scanner sc = new Scanner(System.in);
    String patientName;
    int patientID;
    int daysAdmitted;
    int roomChargePerDay;
    int medicineCharge;
    int doctorFee;
    int totalBill;
    int roomCharge;
    float discount =0.20f;
    float discountprice;

    void getDetails(){
        System.out.println("Enter Patient Name: ");
        patientName = sc.nextLine();
        System.out.println("Enter Patient ID:");
        patientID = sc.nextInt();

    }

    void admissionDetails(int daysAdmitted, int roomChargePerDay){
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay= roomChargePerDay;

        roomCharge = daysAdmitted*roomChargePerDay;
    }

    void billingDetails(int medicineCharge, int doctorFee){
        this.medicineCharge=medicineCharge;
        this.doctorFee=doctorFee;

        totalBill =(roomCharge+doctorFee+medicineCharge);

        if(totalBill>10000){
            System.out.println("Patient is eligible for discount of 20%");
            totalBill =  totalBill- (int)(totalBill*discount);
        }
    }

    void displayDetails(){
        System.out.println("Patient Name: "+patientName);
        System.out.println("Patient ID "+patientID);
        System.out.println("Admitted Days: "+daysAdmitted);
        System.out.println("Room Charges: "+roomChargePerDay);
        System.out.println("Total Room Charge "+roomCharge);
        System.out.println("Doctor Fee: "+doctorFee);
        System.out.println("Medicine Charge: "+medicineCharge);
        if(totalBill>10000) {
            System.out.println("Discount: " + (totalBill*discount));
        }else {
            System.out.println("No Discount");
        }
        System.out.println("Total Bill "+totalBill);

    }

    public static void main(String[] args) {
        PatientBillingSystem pbs = new PatientBillingSystem();
        pbs.getDetails();
        pbs.admissionDetails(2,625);
        pbs.billingDetails(940,1000);
        pbs.displayDetails();
    }

}
