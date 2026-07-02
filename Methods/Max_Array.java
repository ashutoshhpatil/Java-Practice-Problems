package Methods;

public class Max_Array {
    int arr[]=new int[]{45,66,98,32,68,78,102,43};
    int n =arr.length;

    int min =arr[0];

    int Max(){
        for(int i=0;i<n;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println(min);
        return min;

    }
}

class W{
    public static void main(String[] args) {
        Max_Array ma = new Max_Array();
        ma.Max();
    }
}
