package ExceptionHandling;

public class Program2 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};

        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[6]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bound");
        }
    }
}
