package Abstraction;

import java.util.Date;

abstract class Hospital{
    String hospitalName = "KMCH";
    int docId;
    String docName;
    int experience;
    String specialization;
    int basicPay;
    float totalSalary;
    int consultationFee;
    float patientIncome;
    int noOfPatient;
    float patientCharge = 0.70f;

    abstract void assignPatient();

    abstract void treatPatient();

    void dispInfo(){
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Doctor ID: "+docId);
        System.out.println("Doctor Name: "+docName);
        System.out.println("Experience: "+experience);
        System.out.println("Specialization: "+specialization);

    }

    void hospitalRules(){
        System.out.println("1. Maintain patient confidentiality.\n" +
                "2. Wear hospital uniform.\n" +
                "3. Follow safety protocols.\n" +
                "4. Report emergency cases immediately.");
    }

}

abstract class Doctor extends Hospital{

    abstract void performTreatment();
    abstract void calcConsultationFee();



    void calcSalary() {
        patientIncome = patientCharge * (consultationFee * noOfPatient);
        totalSalary = patientIncome + basicPay;
    }

    void doctorRoutine() {

            dispInfo();
            assignPatient();
            calcConsultationFee();
            treatPatient();
            performTreatment();
            generatePrescription();
            calcSalary();

            System.out.println("Consultation Fee: " + consultationFee);

            System.out.println("Basic Pay: " + basicPay);
            System.out.println("Total Salary: " + totalSalary);

            hospitalRules();

    }

    void generatePrescription(){
        System.out.println("Prescription Generated Successfully.\n" +
                "Take medicines as prescribed.\n" +
                "Visit after 7 days.");
    }
}

class Surgeon extends Doctor{
    {
        docName = "Dr. Madhukar Kadam";
        docId = 5648;
        experience = 26;
        specialization = "Surgery";
        basicPay = 85000;
        noOfPatient = 50;
    }

    @Override
    void assignPatient() {
        System.out.println("Assigning patient for surgery...");
    }

    @Override
    void treatPatient() {
        System.out.println("Performing surgery...");
    }

    @Override
    void performTreatment() {
        System.out.println("Performing open-heart surgery.");
    }

    @Override
    void calcConsultationFee() {
        consultationFee = 2500;
    }


}

class CardioLogist extends Doctor{
    {
        docName = "Dr. Madhura Kadam";
        docId = 5548;
        experience = 16;
        specialization = "Cardiology";
        basicPay = 90000;
        noOfPatient = 45;

    }

    @Override
    void assignPatient() {
        System.out.println("Assigning heart patient...");
    }

    @Override
    void treatPatient() {
        System.out.println("Treating heart disease...");
    }

    @Override
    void performTreatment() {
        System.out.println("Performing ECG and Angiography.");
    }

    @Override
    void calcConsultationFee() {
        consultationFee = 1800;
    }

}

class Neurologist extends Doctor{
    {
        docName = "Dr. Vighnesh Kadam";
        docId = 5748;
        experience = 10;
        specialization = "Neurology";
        basicPay = 75000;
        noOfPatient = 20;
    }

    @Override
    void assignPatient() {
        System.out.println("Assigning brain and nervous system patient...");
    }

    @Override
    void treatPatient() {
        System.out.println("Treating nervous system disorder...\n ");
    }

    @Override
    void performTreatment() {
        System.out.println("Performing MRI and Brain Examination.");
    }

    @Override
    void calcConsultationFee() {
        consultationFee = 2800;
    }
}

public class SmartHospital {
    public static void main(String[] args) {
        Doctor obj;
        obj = new Surgeon();
        obj.doctorRoutine();
        System.out.println("----------------------");

//        obj = new CardioLogist();
//        obj.doctorRoutine();
//        System.out.println("----------------------");
//
//        obj= new Neurologist();
//        obj.doctorRoutine();

    }
}





