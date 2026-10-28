package ExceptionHandling;

public class Program1 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        try{
            if(denominator == 0){
               int result  = numerator/denominator;
            }
        }
        catch ( ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
