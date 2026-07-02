package Methods;

public class Even_Count {

    int arr[]=new int[]{5,8,9,2,4,8,6,1,3,2,6,4,4};
    int n =arr.length;
    int count =0;

    void calc(){
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

class E{
    public static void main(String[] args) {
        Even_Count ec = new Even_Count();
        ec.calc();
    }
}
