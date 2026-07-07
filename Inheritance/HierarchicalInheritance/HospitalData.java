package Inheritance.HierarchicalInheritance;

class Hospital{
    String hospitalName = "KMCH";
    String docName = "Dr.Vivek Pathak";
    int totalBill;
}

class InPatient extends  Hospital{
    String patientName = "Alexander";
    int medicineCharges = 652;
    int roomCharges = 1250;
    int daysAdmitted = 8;

    void calcCharges(){
        totalBill = roomCharges*daysAdmitted+medicineCharges;
    }

    void dispInPatient(){
        System.out.println("Patient Name: "+patientName);
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Doctor Name: "+docName);
        System.out.println("Total Bill: "+totalBill);
    }
}

class OutPatient extends Hospital{
    int consultationFee = 500;
    int medicineCharges = 654;
    String name = "Aluva";

    void dispOut(){
        System.out.println("Patient Name: "+name);
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Doctor Name: "+docName);
        System.out.println("Total Bill: "+(consultationFee+medicineCharges));
    }
}
public class HospitalData {
    public static void main(String[] args) {
        InPatient ip= new InPatient();
        ip.calcCharges();
        ip.dispInPatient();

        System.out.println();

        OutPatient op = new OutPatient();
        op.dispOut();

    }
}
