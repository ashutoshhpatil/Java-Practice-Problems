package DataHiding;

public class Student {
    private int marks;

    public void setMarks(int m) {
        marks = m;
    }

    public int getMarks() {
        return marks;
    }
}
class Main{
    public static void main(String[] args) {
        Student obj= new Student();
        obj.setMarks(100);      // we are accessing data member "marks" from another class
        System.out.println("Student Mark : "+ obj.getMarks());
    }
}
