package Inheritance.Assignment1.SingleLevelInheritance;

class Hospital{
    int hospitalID = 256478;
    String hospitalName= "Yashoda Hospitals";
    String location= "Hyderabad";
}

class EmergencyWard extends Hospital{
    int patientID = 1235;
    String patientName = "Gangadhar";
    int patientAge = 82;
    String bloodGroup = "B+ve";
    String priorityLevel;
    int oxyLevel = 84;
    String injurySeverity = "Severe";
    int pulserate = 122;

    void getDetails(){
        if(oxyLevel<85 && injurySeverity.equals("Severe")){
            priorityLevel = "Critical";
        }else if(oxyLevel>80 && oxyLevel<90 && patientAge>75 && pulserate>120 ){
            priorityLevel = "High";
        }else if(oxyLevel>91 && oxyLevel<95 && injurySeverity.equals("Moderate")){
            priorityLevel = "Medium";
        }else {
            priorityLevel = "Low";
        }
    }

    void dispDetails(){
        System.out.println("Patient Name: "+patientName);
        System.out.println("Patient Id: "+patientID);
        System.out.println("Patient Age: "+patientAge);
        System.out.println("Patient Blood Group: "+bloodGroup);
        System.out.println("Oxygen Level: "+oxyLevel);
        System.out.println("Priority Level: "+priorityLevel);
        if(priorityLevel.equals("Critical"))
            System.out.println("Immediate ICU Admission Required");
        else if (priorityLevel.equals("High")) {
            System.out.println("Doctor Should Attend Immediately");
        } else if (priorityLevel.equals("Medium")) {
            System.out.println("Observation Required");
        }else {
            System.out.println("General Observation");
        }
        System.out.println("--------------------------------------");
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Hospital ID: "+hospitalID);
        System.out.println("Hospital Location: "+location);
    }
}

public class HospitalEW {
    public static void main(String[] args) {
        EmergencyWard ew = new EmergencyWard();
        ew.getDetails();
        ew.dispDetails();

    }
}
