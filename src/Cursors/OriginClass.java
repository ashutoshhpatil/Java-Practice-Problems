package Cursors;
import java.util.*;

public class OriginClass {
    public static void main(String[] args) {
        Vector v = new Vector();
        Enumeration e =v.elements();
        System.out.println(e.getClass().getName()); // java.util.Vector$1   (Anonymous Inner Class of Outer class-Vector)

        Iterator itr = v. iterator();
        System.out.println(itr.getClass().getName());  // java.util.Vector$Itr

        ListIterator itr1 = v.listIterator();
        System.out.println(itr1.getClass().getName());  // java.util.Vector$ListItr
    }
}
