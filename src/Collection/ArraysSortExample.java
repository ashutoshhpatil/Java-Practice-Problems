package Collection;
import java.util.*;
public class ArraysSortExample {
    public static void main(String[] args) {
        /// Public Static void sort(Primitive []p);
        int a[] = {5,8,9,1,3,2};
        System.out.print("Primitive Array Before Sorting: ");
        for(int a1:a){
            System.out.print(a1+" ");
        }
        System.out.println();
        Arrays.sort(a);
        System.out.print("Primitive Array After Sorting: ");
        for(int a1:a){
            System.out.print(a1+" ");
        }
        System.out.println();

        /// Public Static void sort(Object[]o);
        String []s = {"A","S","Z","E","C"};
        System.out.print("Object Array Before Sorting: ");
        for(String s1:s){
            System.out.print(s1+" ");
        }
        System.out.println();
        Arrays.sort(s);
        System.out.print("Object Array After Sorting: ");
        for( String s1:s){
            System.out.print(s1+" ");
        }
        System.out.println();

        /// Public Static void sort(Object[]o,Comparator c);
        String []x = {"A","S","Z","E","C"};
        System.out.print("Object with Comparator Array Before Sorting: ");
        for(String x1:x){
            System.out.print(x1+" ");
        }
        System.out.println();
        Arrays.sort(x, new MyComparator1());
        System.out.print("Object with Comparator Array After Sorting: ");
        for( String x1:x){
            System.out.print(x1+" ");
        }

    }
}


class MyComparator1 implements Comparator{
    public int compare(Object o1,Object o2){
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
