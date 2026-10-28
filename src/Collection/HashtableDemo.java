package Collection;

import java.util.Hashtable;

public class HashtableDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        Hashtable h = new Hashtable();
        h.put(new Temp1(5),"A");
        h.put(new Temp1(2),"B");
        h.put(new Temp1(6),"C");
        h.put(new Temp1(15),"D");
        h.put(new Temp1(23),"E");
        h.put(new Temp1(16),"F");

        System.out.println(h);
    }
}


class Temp1{
    int i;
    Temp1(int i){
        this.i=i;
    }

    public int hashCode(){
        return i;
    }

    @Override
    public String toString() {
        return i+" ";
    }
}