package ExceptionHandling;

public class Program6 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;

        try {
            int result  = num1/num2;
            System.out.println("Result is : "+result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("Program Executed Successfully");
        }
    }
}
