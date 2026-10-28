package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapDemo {
    public static void main(String[] args) {
        List <String> l1 = new ArrayList<>();
        l1.add("Ashutosh");
        l1.add("Aditya");

        List <String> l2 = new ArrayList<>();
        l2.add("Ashish");
        l2.add("Pandurang");

        List<List<String>> l3 = new ArrayList<>();
        l3.add(l1);
        l3.add(l2);

        System.out.println(l3.stream().flatMap(p->p.stream()).collect(Collectors.toList()));

       //Simplified Version =>  System.out.println(l3.stream().flatMap(Collection::stream).toList());


    }
}
