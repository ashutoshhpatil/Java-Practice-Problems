package Inheritance;

import java.util.Scanner;

class University{
//    Scanner sc = new Scanner(System.in);
    String uniName = "SPPU";
    int uniCode = 404;
    String chancellorName = "gyfty";

    void dispDetailsUni(){
        System.out.println("University Name: "+uniName);
        System.out.println("University Code: "+uniCode);
        System.out.println("Chancellor Name: "+chancellorName);
    }
}

class Department extends University{
    String departName = "Computer Engineering";
    String hodName = "ABCXYZ";
    int departId = 405;

    void dispDepart(){
        super.dispDetailsUni();
        System.out.println("==============================");
        System.out.println("Department Name: "+departName);
        System.out.println("Department HOD: "+hodName);
        System.out.println("Department ID: "+departId);
    }
}

class Student extends Department {
    int rollNumber = 73239031;
    String studentName = " jknjn";
    int semester = 6;
    int s1=39, s2=100, s3=100, s4=100, s5=100, s6=100   ;
    float totalMarks;
    float percentage;
    String grade;

    void calcResult() {
        if (s1 < 0 || s1 > 100 ) {
            System.out.println("Invalid Marks... Please Enter Correct Marks ");
            System.exit(0);
        }
        if(s2 < 0 || s2 > 100){
            System.out.println("Invalid Marks... Please Enter Correct Marks ");
            System.exit(0);
        }
        if(s3 < 0 || s3 > 100){
            System.out.println("Invalid Marks... Please Enter Correct Marks ");
            System.exit(0);
        }
        if(s4 < 0 || s4 > 100){
            System.out.println("Invalid Marks... Please Enter Correct Marks ");
            System.exit(0);
        }
        if(s5 < 0 || s5 > 100){
            System.out.println("Invalid Marks... Please Enter Correct Marks ");
            System.exit(0);
        }
        if(s6 < 0 || s6 > 100){
            System.out.println("Invalid Marks... Please Enter Correct Marks ");
            System.exit(0);
        }


        totalMarks = s1 + s2 + s3 + s4 + s5 + s6;

        percentage = (totalMarks / 600) * 100;

        if (percentage >= 90) {
            grade = "O";
        } else if (percentage >= 80 ){
            grade = "A+";
        } else if (percentage >= 70) {
            grade = "A";
        } else if (percentage >= 60) {
            grade = "B+";
        } else if (percentage >=50) {
            grade = "B";
        } else if (percentage >=40) {
            grade = "C";
        } else {
            grade = "Fail";
        }

    }
    void dispStudent(){
        super.dispDepart();
        System.out.println("==============================");
        System.out.println("Student Name: "+studentName);
        System.out.println("Roll No: "+rollNumber);
        System.out.println("Semester: "+semester);

    }
}

class Faculty extends Department{
    int facultyId = 404;
    String facultyName = "Sanjay Jadhav";
    String subject = "Mathematics";
    int experience = 12;
    int basicPay = 115800;
    int totalSalary;

    void calcSalary(){
        if(experience>=15){
            totalSalary = basicPay+(int)(0.25*basicPay);
        }else if(experience>=10){
            totalSalary = basicPay+(int)(0.15*basicPay);
        }else if(experience>=5){
            totalSalary = basicPay+(int)(0.08*basicPay);
        }else {
            totalSalary = basicPay;
        }
    }

    void dispFaculty(){
        super.dispDepart();
        System.out.println("==============================");
        System.out.println("Faculty Name: "+facultyName);
        System.out.println("Faculty ID: "+facultyId);
        System.out.println("Subject: "+subject);
        System.out.println("Basic Pay: "+basicPay);
        System.out.println("Total Salary: "+totalSalary);
    }
}

class ExamResult extends Student{
    int backlogCount;
    String resultStatus;

    void calcBacklog(){
        if(s1<40){
            backlogCount++;
        }
        if(s2<40){
            backlogCount++;
        }
        if(s3<40){
            backlogCount++;
        }
        if(s4<40){
            backlogCount++;
        }
        if(s5<40){
            backlogCount++;
        }
        if(s6<40){
            backlogCount++;
        }

        if(backlogCount == 0){
            resultStatus = "Pass";
        }else {
            resultStatus = "Fail";
        }
    }

    void dispExamResult(){
        super.dispStudent();
        System.out.println("Is Any Backlog: "+backlogCount);
        System.out.println("Result: "+resultStatus);
    }
}
public class UniversityManagement {
    public static void main(String[] args) {
        ExamResult er = new ExamResult();
        er.calcResult();
        er.calcBacklog();
        er.dispExamResult();
        if(er.backlogCount>0){
            return;
        }else {
            System.out.println("Total marks: " + er.totalMarks);
            System.out.println("Percentage: " + er.percentage);
            System.out.println("Grade: " + er.grade);
        }
        System.out.println("=========================================");
//
//        Faculty ff = new Faculty();
//        ff.calcSalary();
//        ff.dispFaculty();

    }
}
