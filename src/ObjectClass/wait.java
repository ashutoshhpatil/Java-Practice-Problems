package ObjectClass;

class wait {
    public static void main(String[] args)
            throws InterruptedException {

        Object lock = new Object();

        Thread t = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Student is waiting");

                    lock.wait();

                    System.out.println("Student got notification");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        t.start();

        Thread.sleep(1000);

        synchronized (lock) {
            lock.notify();
        }
    }
}
