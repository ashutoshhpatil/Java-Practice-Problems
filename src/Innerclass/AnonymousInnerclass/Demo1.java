package Innerclass.AnonymousInnerclass;

class Popcorn{
    public void taste(){
        System.out.println("Salty");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Popcorn p = new Popcorn(){
            public void taste(){
                System.out.println("Sweet");
            }
        };
        p.taste();  // Sweet

        System.out.println(p.getClass().getName());   //Innerclass.AnonymousInnerclass.Demo1$1
    }

}
