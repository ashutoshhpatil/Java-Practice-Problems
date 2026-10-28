package ExceptionHandling;

public class Program5 {
    public static void main(String[] args) {
        int arr[] = new int[5];

        String s = null;

        try {
            int x = 10/0;
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[6]);
            }

            System.out.println(s.length());
        }
        catch (ArithmeticException e1){
            System.out.println("Arithmetic Exception may rise");
        }

        catch (NullPointerException e2){
            System.out.println("Null Pointer Exception may rise");
        }

        catch (ArrayIndexOutOfBoundsException e3){
            System.out.println("Array Index out of Bound Exception may rise");
        }
    }
}
