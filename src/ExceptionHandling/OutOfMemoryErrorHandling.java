package ExceptionHandling;

public class OutOfMemoryErrorHandling {
    public static void main(String[] args) {
        try{
            int arr[] = new int[Integer.MAX_VALUE];
        }catch (OutOfMemoryError e){
            System.out.println(e);
        }

        System.out.println("Program Continuation");

        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}
