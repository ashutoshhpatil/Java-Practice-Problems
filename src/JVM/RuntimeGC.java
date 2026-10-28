package JVM;
import java.util.Date;

public class RuntimeGC {
    public static void main(String[] args) {
        float mb = 1024*1024;
        Runtime r = Runtime.getRuntime();
        System.out.println("Total Memory: "+r.totalMemory()/mb+ " MB");
        System.out.println("Initial Free Memory: "+r.freeMemory()/mb+ " MB");

        for(int i=0;i<=10000;i++){
            Date d = new Date();
            d = null;
        }

        System.out.println("Remaining Memory: "+r.freeMemory()/mb+ " MB");
        System.out.println("Performing GC");
        long usedMemoryBefore = r.totalMemory() - r.freeMemory();
        r.gc();
        long usedMemoryAfter = r.totalMemory() - r.freeMemory();

        System.out.println("Used Memory Before GC: " + usedMemoryBefore / mb + " MB");

        System.out.println("Used Memory After GC: " + usedMemoryAfter / mb + " MB");

    }
}
