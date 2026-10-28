package Collection;

import java.util.*;

public class WeakHashMapDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws InterruptedException{
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t,"Durga");
        System.out.println(m);

        t=null;

        System.gc();

        Thread.sleep(5000);

        System.out.println(m);
    }
}

class Temp{
    @Override
    public String toString() {
        return "temp";
    }

    public void finalize(){
        System.out.println("Finalize Method called ... GC performed his works");
    }
}
