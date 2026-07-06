package Inheritance.Assignment1.SingleLevelInheritance;

class Exam{
    String name;
    int m1 = 98;
    int m2 = 99;
    int m3 = 96;

}
class CompetitiveExam extends Exam{
    float totalMarks;
    float percentage;
    String rank;

    void calResult(){
        totalMarks = m1+m2+m3;
        percentage =  ((totalMarks/300)*100);

        if(percentage >95){
            rank = "Topper";
        } else if (percentage>90 && percentage<=95){
            rank = "Excellent";
        }else if(percentage>75 && percentage<90){
            rank = "Average";
        }else {
            rank = "Needs Improvement";
        }
    }

    void dispDetails(){
        System.out.println("Name: "+name);
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Percentage: "+percentage);
        System.out.println("Rank: "+rank);
    }
}
public class ExamResult {
    public static void main(String[] args) {
        CompetitiveExam ce = new CompetitiveExam();
        ce.name = "Ashutosh";
        ce.calResult();
        ce.dispDetails();

    }
}
