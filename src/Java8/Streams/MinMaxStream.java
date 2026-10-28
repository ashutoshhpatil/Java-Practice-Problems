package Java8.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class MinMaxStream {
    public static void main(String[] args) {
        List <Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(45);
        numbers.add(85);

//        System.out.println(numbers.stream()
//                .min((t1,t2)->(t1<t2)?-1:(t1==t2)?0:1));      /// Optional[10]
//
//        System.out.println(numbers.stream()
//                .max((t1,t2)->(t1<t2)?-1:(t1==t2)?0:1));      /// Optional[85]


        System.out.println(numbers.stream()
                .min((t1,t2)->Integer.compare(t1,t2)).get());


        System.out.println(numbers.stream()
                .max((t1,t2)->Integer.compare(t1,t2)).get());

        /// Sort the given list

        System.out.println("Ascending Order: "+ numbers.stream().sorted().collect(Collectors.toList()));   ///By default ascending order

        /// If we want in Descending order

        System.out.println("Descending Order : "+numbers.stream().sorted((t1,t2)-> (t1<t2)?1:(t1==t2)?0:-1).collect(Collectors.toList()));

    }
}
