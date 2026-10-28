/// Demo Program for Default Natural Order Sorting

package Collection;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap m = new TreeMap();
        m.put(101,"A");
        m.put(102,"B");
        m.put(103,"C");
        m.put(104,"D");
        m.put(105,"E");

        System.out.println(m);  //{101=A, 102=B, 103=C, 104=D, 105=E}
    }
}
