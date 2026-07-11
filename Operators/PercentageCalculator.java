package Operators;

public class PercentageCalculator {
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;
    double percentage;

    void markDetails(int mark1,int mark2,int mark3){
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
        totalMarks = mark1+mark2+mark3;
    }

    void calcpercentage(){
        percentage = (totalMarks/300.0)*100;
    }

    void dispDetails(){
        System.out.println("Maths "+mark1);
        System.out.println("English "+mark2);
        System.out.println("Science "+mark3);
        System.out.println("Total Marks "+totalMarks);
        System.out.println("Percentage "+percentage);
    }

    public static void main(String[] args) {
        PercentageCalculator pc = new PercentageCalculator();
        pc.markDetails(65,85,95);
        pc.calcpercentage();
        pc.dispDetails();
    }
}
