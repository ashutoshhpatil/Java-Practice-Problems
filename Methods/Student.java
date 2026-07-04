package Methods.Assignment1;

public class Student {
    String studentName;
    int rollNo;
    String collegeName;


    void getStudentDetails(){
        System.out.println("College Name: "+collegeName);
    }

    void setStudentName(String name){
        System.out.println("Student name: "+name);
    }

    int getRollNo(){
        System.out.println("Student RollNo: "+rollNo);
        return rollNo;
    }

    int calculateMarks(int m1, int m2){
        int totalMarks = m1+m2;
        System.out.println("Total Marks Obtained in two subjects "+totalMarks);
        return totalMarks;
    }

    public static void main(String[] args) {
        Student student = new Student();
        //student.studentName = "Ashutosh";
        student.rollNo = 101;
        student.collegeName = "SKN College of Engineering";

        student.getStudentDetails();
        student.setStudentName("Madhav");
        student.getRollNo();
        student.calculateMarks(75,96);

    }


}
