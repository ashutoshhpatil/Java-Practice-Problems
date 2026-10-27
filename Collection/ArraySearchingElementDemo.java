package Collection;

import java.util. *;

import static java.util.Arrays.binarySearch;

public class ArraySearchingElementDemo {
    public static void main(String[] args) {
        /// Public Static void binarySearch(Primitive []p);
        int a[]={4,6,8,7,2,3};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,7));


        String []s = {"A","S","Z","E","C"};
        Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s,"A"));

        Arrays.sort(s,new MyComparator2());
        System.out.println(Arrays.binarySearch(s,"Z"));
    }
}

class MyComparator2 implements Comparator{
    public int compare(Object o1, Object o2){
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
