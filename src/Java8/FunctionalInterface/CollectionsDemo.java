package Java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList <Integer> l = new ArrayList<>();
        l.add(10);
        l.add(5);
        l.add(6);
        l.add(4);

        Comparator <Integer> c = (I1,I2)-> (I1<I2)?-1:(I1>I2)?1:0;
        Collections.sort(l,c);
        System.out.println(l);
    }
}
