package Java8;

class Sample{
    Sample(String s){
        System.out.println("Sample class constructor execution with argument : "+s);
    }
}

interface interf{
    public Sample get(String s);
}

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        interf i = Sample::new;
        i.get("Durga");
    }
}
