package Innerclass;

class University{
    static int x = 10;
    int y = 20;

    class Department{
         void m1(){
             System.out.println(x);  // Static Method can be accessed from inner class
                                     // which is declared inside an inner class
             System.out.println(y);
         }
    }
}


public class IntroToInnerClass {
    public static void main(String[] args) {
//        University obj1 = new University();
//        University.Department obj2 = obj1.new Department();

        University.Department inner  = new University().new Department();
        inner.m1();
    }

}

