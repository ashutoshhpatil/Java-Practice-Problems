package Collection;
import java.util.*;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap m = new TreeMap(new MyComparator());
        m.put(101,"A");
        m.put(102,"B");
        m.put(103,"C");
        m.put(104,"D");
        m.put(105,"E");

        System.out.println(m);
    }
}

class MyComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        String s1 = obj1.toString();
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}
