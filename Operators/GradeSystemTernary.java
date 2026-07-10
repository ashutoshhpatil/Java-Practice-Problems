package Operators;

public class GradeSystemTernary {
    int marks;

    void getDetails(){
        String result =  (marks>75)?("A")
                : (marks>60)? ("B")
                :(marks>30)?("C")
                :"Fail";
        System.out.println("Obtained Grade: "+result);
    }

    public static void main(String[] args) {
        GradeSystemTernary gr =new GradeSystemTernary();
        gr.marks = 15;
        gr.getDetails();
    }
}
