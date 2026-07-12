package Constructor;

class Student{
    String studentName;
    int rollNo;
    String Grade;
    int Class;

    Student(String s,int r,String g,int c){
        studentName = s;
        rollNo=r;
        Grade =g;
        Class =c;
    }

    void dispStudent(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Grade: "+Grade);
        System.out.println("Class:  "+Class+ " th");
    }
}

public class ConstructorBasics {
    public static void main(String[] args) {
        Student obj = new Student("Ashutosh",-44,"A+",10);
        obj.dispStudent();
    }
}
