package Methods;

public class Average_Array {
    int arr[]=new int[]{5,6,9,8,7,6,3,2,4,1,2};
    int n = arr.length;
    float avg =0;
    int sum =0;
    void Average(){
        for(int i =0;i<n;i++){
            sum += arr[i];

            avg = sum/n;
        }
        System.out.println("The Average is:" +avg);
    }
}

class A{
    public static void main(String[] args) {
        Average_Array aa = new Average_Array();
        aa.Average();
    }
}
