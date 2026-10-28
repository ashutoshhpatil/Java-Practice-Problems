package Java8.Streams;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        Optional<String> s = display("Hi ");
        if(s.isPresent()){
            System.out.println(s.get());
            System.out.println("Not Null");
        }
        else {
            System.out.println("Null Sapdla");
        }
    }

    public static Optional<String> display(String i) {
        Optional op = Optional.ofNullable(i);
        return  op;
    }
}
