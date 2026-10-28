package JVM;

public class HeapStatistics {
    public static void main(String[] args) {
        float mb = 1024 *1024;

        Runtime r = Runtime.getRuntime();
        System.out.println("Max Memory: "+r.maxMemory()/mb+ " MB");
        System.out.println("Total Memory(heap Memory allocated by JVM for Process): "+r.totalMemory()/mb+ " MB");
        System.out.println("Free Memory: "+r.freeMemory()/mb+ " MB");
        System.out.println("Consumed Memory: "+(r.totalMemory()/mb-r.freeMemory()/mb)+ " MB");
    }
}
