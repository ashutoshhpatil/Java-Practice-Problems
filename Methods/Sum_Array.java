package Methods;

public class Sum_Array {
    int arr[]=new int[]{8,6,7,5,1,2,4,3,9};
    int n = arr.length;
    int sum = 0;
    void Add(){
        for(int i =0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("The Sum of the array is:" +sum);
    }
}

class L{
    public static void main(String[] args) {
        Sum_Array sa = new Sum_Array();
        sa.Add();
    }
}
