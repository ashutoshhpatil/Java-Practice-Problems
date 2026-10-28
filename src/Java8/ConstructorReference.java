package Java8;

interface Interf{
    void show();
}

class Test {
    Test(){
        System.out.println("1.Object Creation Started");
    }
}

public class ConstructorReference{
    public static void main(String[] args) {
        Interf i = Test :: new;
        i.show();

        System.out.println("2.Object Successfully created");
    }
}
