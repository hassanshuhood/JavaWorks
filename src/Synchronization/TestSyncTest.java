package Synchronization;

class TestSync implements Runnable {
    private int balance;

    public void run() {
        for (int i = 0; i < 50; i++) {
            increment();
            System.out.println(Thread.currentThread().getName() + " balance is " + balance);
        }
    }

    public synchronized void increment() {
        int i = balance;
        balance = i + 1;
    }
}

public class TestSyncTest {
    public static void main(String[] args) {
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        a.setName("a");
        Thread b = new Thread(job);
        b.setName("b");
        a.start();
        b.start();
    }
}
