package Methods;

public class Sum {

    int calc(int num1, int num2){
        int sum = num1+num2;
        System.out.println("The Sum is:"+sum);
        return sum;
    }
}

class Main{
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.calc(65,35);
    }
}
