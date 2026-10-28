package ConditionalStatements;
import java.util.Scanner;
public class AdmissionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CET Percentile:");
        float percentile = sc.nextFloat();
        System.out.println("Enter CET Score:");
        int score = sc.nextInt();
        System.out.println("Enter Category");
        String category = sc.next();

        if(category.equals("OBC") || category.equals("SC") || category.equals("ST")){
            if(percentile>=70 && score>=85){
                System.out.println("Computer Engineering");
            }
            else if(percentile>=65 && score>=80){
                System.out.println("IT");
            }
            else if(percentile>=60 && score>=75){
                System.out.println("ENTC");
            }
            else if(percentile>=55 && score>=70){
                System.out.println("Mechanical");
            }
            else {
                System.out.println("Not Eligible");
            }

        }else {
            if (percentile>=75 && score >= 90){
                System.out.println("Computer Engineering");
            }
            else if(percentile>=70 && score>=85){
                System.out.println("IT");
            }
            else if(percentile>=65 && score>=80){
                System.out.println("ENTC");
            }
            else if(percentile>=60 && score>=80){
                System.out.println("Mechanical");
            }
            else {
                System.out.println("Not Eligible");
            }
        }

    }
}
