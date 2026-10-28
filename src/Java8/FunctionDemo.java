package Java8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String, String> f = s -> s.toUpperCase();
        System.out.println( f.apply("durgasoftwaresolutions"));

        Function < String,Integer > f1 =s1 ->s1.length();
        System.out.println(f1.apply("Ashutosh"));
    }
}
