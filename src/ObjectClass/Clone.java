package ObjectClass;

public class Clone implements Cloneable{
    int a=10;
    int b=20;
    public static void main(String[] args) throws CloneNotSupportedException{
        Clone c1= new Clone();
        Clone c2 = (Clone)c1.clone();
        c2.a = 100;
        c2.b = 200;

        System.out.println("Original Object: "+c1.a+"..........."+c1.b);
        System.out.println("Duplicate Object: "+c2.a+"..........."+c2.b);
    }
}

