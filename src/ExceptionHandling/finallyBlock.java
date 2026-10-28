package ExceptionHandling;

public class finallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("TRY");
        }
        catch (Exception e){
            System.out.println("CATCH");
        }
        finally {
            System.out.println("FINALLY");
        }
    }
}
