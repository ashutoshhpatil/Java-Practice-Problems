package Inheritance;
import java.util.*;

class Person {
    Scanner sc = new Scanner(System.in);
    Long personID;
    String name;
    int age;
    String gender;

    void getDetails() {
        System.out.println("Enter Name;");
        name = sc.nextLine();
        System.out.println("Enter Age:");
        age = sc.nextInt();
        System.out.println("Enter Gender(Male/Female):");
        gender = sc.next();
        System.out.println("Enter aadhar ID: ");
        personID = sc.nextLong();
    }

    void dispDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Aadhar ID: " + personID);
    }
}

class Doctor extends Person{
        String Specialization;
        int consultationFee;
        int noOfPatients;
        int salary;

        void getDetailsDoctor(){
            super.getDetails();
            System.out.println("Enter Specialization:");
            Specialization = sc.next();
            if(!(Specialization.equalsIgnoreCase("Nephrology") ||
                    Specialization.equalsIgnoreCase("Cardiology") ||
                    Specialization.equalsIgnoreCase("Neurology"))) {
                System.out.println("Invalid Specialization ... Redirecting to Main Menu");
                System.exit(0);
            }
            System.out.println("Enter no of Patients treated:");
            noOfPatients = sc.nextInt();
        }

        void calculateSalary(){
            if(Specialization.equalsIgnoreCase("Nephrology")){
                consultationFee = 500;
            } else if (Specialization.equalsIgnoreCase("Cardiology")){
                consultationFee = 700;
            } else if (Specialization.equalsIgnoreCase("Neurology")){
                consultationFee = 1500;
            }
            else {
                System.out.println("Invalid Specialization");
            }
            salary = noOfPatients*consultationFee;
            if(noOfPatients>50){
                salary = salary+20000;
            }
        }

        void dispDetailsDoctor(){
            super.dispDetails();
            System.out.println("Specialization: "+Specialization);
            System.out.println("Salary: "+salary);
        }
}

class Nurse extends Person{
        String department;
        int workingHours;
        int salary;
    int baseSalary = 25000;

        void getDetailsNurse(){
            super.getDetails();
            System.out.println("Enter Department: ");
            department = sc.next();
            System.out.println("Enter Working Hours: ");
            workingHours = sc.nextInt();
        }

        void calcSalary(){
            if(workingHours > 200 ){
                salary = baseSalary+5000;
            }else {
                salary = baseSalary;
            }
        }

        void dispDetailsNurse(){
            super.dispDetails();
            System.out.println("Working Hours: "+workingHours);
            System.out.println("Total Salary: "+salary);
        }
}

class Patient extends Person{
        String diseaseName;
        String roomType;
        int noOfDays;
        int roomCharge;
        int totalBill;
        int roomCharges;

        void getDetailsPatient(){
            super.getDetails();
            System.out.println("Which Diseases you have: ");
            diseaseName = sc.next();
            System.out.println("Which Type of Room:");
            roomType = sc.next();

            if(!(roomType.equalsIgnoreCase("General")) ||
                 (roomType.equalsIgnoreCase("Semi")) ||
                 (roomType.equalsIgnoreCase("Private"))){
                System.out.println("Invalid Room Type ... Redirecting to Main Menu");
                System.exit(0);
            }
            System.out.println("No of Days? ");
            noOfDays = sc.nextInt();
        }

        void calcBill(){
            if(roomType.equalsIgnoreCase("General")){
                roomCharge = 500;
            } else if (roomType.equalsIgnoreCase("Semi")) {
                roomCharge = 1000;
            } else if (roomType.equalsIgnoreCase("Private")) {
                roomCharge = 2000;
            }else {
                System.out.println("Invalid Room Type");
            }
               roomCharges = roomCharge*noOfDays;
               totalBill = roomCharges + (int)(roomCharges *0.05);
        }

        void dispDetailsPatient(){
            super.dispDetails();
            System.out.println("Disease Name: "+diseaseName);
            System.out.println("Room Type: "+roomType);
            System.out.println("No of Days: "+noOfDays);
            System.out.println("Room Charges: "+ roomCharges);
            System.out.println("Total Bill: "+totalBill);
        }
}


public class HospitalManagement {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("1.Doctor");
        System.out.println("2.Nurse");
        System.out.println("3.Patient");

        System.out.println("Enter Choice:");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                Doctor doctor = new Doctor();
                doctor.getDetailsDoctor();
                doctor.calculateSalary();
                doctor.dispDetailsDoctor();
                break;
            case 2:
                Nurse nurse = new Nurse();
                nurse.getDetailsNurse();
                nurse.calcSalary();
                nurse.dispDetailsNurse();
                break;

            case 3:
                Patient patient = new Patient();
                patient.getDetailsPatient();
                patient.calcBill();
                patient.dispDetailsPatient();
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
