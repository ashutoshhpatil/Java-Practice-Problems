package Collection;

import java.awt.print.PrinterGraphics;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        IdentityHashMap im = new IdentityHashMap();

        ///'Integer(int)' is deprecated since version 9 and marked for removal
        Integer I1 =  new Integer(10);
        Integer I2 =  new Integer(10);

        im.put(I1,"pawan");
        im.put(I2,"durga");

        System.out.println(im);
    }
}
