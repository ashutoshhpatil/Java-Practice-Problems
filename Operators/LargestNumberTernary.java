package Operators;

public class LargestNumberTernary {
    int num1;
    int num2;
    int num3;

    void getInfo(int num1,int num2, int num3){
        int largest = (num1>num2) ?
                ((num1>num3)? num1:num2)
                : ((num2>num3)? num2:num3);

        System.out.println("Largest Number is "+largest);
    }

    public static void main(String[] args) {
        LargestNumberTernary obj = new LargestNumberTernary();
        obj.getInfo(205,625,500);
    }
}
