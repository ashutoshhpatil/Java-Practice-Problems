package Cursors;

import java.util.*;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Ashutosh");
        list.add("Aditya");
        list.add("Madhav");
        list.add("Sharvarii");
        list.add("Sanyukta");

        System.out.println(list);  //[Ashutosh, Aditya, Madhav, Sharvarii, Sanyukta]

        ListIterator itr = list.listIterator();
        while(itr.hasNext()){
            String s = (String)itr.next();
            if(s.equals("Ashutosh")){
                itr.add("Powerhouse");
            }
            else if(s.equals("Sanyukta")){
                itr.remove();
            }
            else if(s.equals("Sharvarii")){
                itr.set("Ashutosh");
            }
        }
        System.out.println(list);  //[Ashutosh, Powerhouse, Aditya, Madhav, Ashutosh]



    }
}
