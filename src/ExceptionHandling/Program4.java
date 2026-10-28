package ExceptionHandling;

public class Program4 {
    public static void main(String[] args) {
        String s = null;
        try{
        System.out.println(s.length());
    }catch (NullPointerException e){
            System.out.println("String Cannot be null");
        }
    }
}
