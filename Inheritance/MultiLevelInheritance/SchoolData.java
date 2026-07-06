package Inheritance.Assignment1.MultilevelInheritance;

class School{
    String schoolName = "LBSV";
    String location = "Udgir";

    void dispSchool(){
        System.out.println("School Name: "+schoolName);
        System.out.println("Location: "+location);
    }
}

class Teacher extends School{
    int teacherID = 9856;
    String teacherName = "Shashi";
    String subject =  "English";
}

class ClassTeacher extends Teacher{
    boolean classAssigned = true;
    int noOfStudents;

    void getCT(){
        if(classAssigned){
            System.out.println("Class: Assigned");
            noOfStudents = 56;
        }else {
            System.out.println("Class: Not Assigned");
        }
    }

    void dispCT(){
        super.dispSchool();
        System.out.println("Teacher Name: "+teacherName);
        System.out.println("Teacher ID: "+teacherID);
        System.out.println("Subject: "+subject);
        if(classAssigned){
        System.out.println("No of Students: "+noOfStudents);
        }
    }

}

public class SchoolData {
    public static void main(String[] args) {
        ClassTeacher ct = new ClassTeacher();
        ct.getCT();
        ct.dispCT();
    }
}
