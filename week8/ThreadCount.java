public class ThreadCount {
    private static final Object lock = new Object();
    private static int startNumber = 1;
    private static final int endNumber = 16;

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> evenNumbers());
        Thread oddThread = new Thread(() -> oddNumbers());
        evenThread.setName("Even-thread");
        oddThread.setName("Odd-thread");

        evenThread.start();
        oddThread.start();
    }

    private static void evenNumbers() {
        while (startNumber < endNumber) {
            synchronized (lock) {
                if (startNumber % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + startNumber);
                    startNumber++;
                }
            }
        }
    }

    private static void oddNumbers() {
        while (startNumber < endNumber) {
            synchronized (lock) {
                if (startNumber % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + startNumber);
                    startNumber++;
                }
            }
        }
    }
}
