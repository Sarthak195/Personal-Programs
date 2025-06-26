import java.util.LinkedList;

public class ThreadExample {
    public static void main(String[] args) {
        PC pc = new PC();

        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                pc.produce();
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                pc.consume();
                try { Thread.sleep(1500); } catch (InterruptedException e) {}
            }
        });

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program finished execution.");
    }

    static class PC {
        private final LinkedList<Integer> list = new LinkedList<>();
        private final int capacity = 2;

        public synchronized void produce() {
            while (list.size() == capacity) {
                try {
                    System.out.println("Buffer full, producer waiting...");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int value = (int) (Math.random() * 100);
            list.add(value);
            System.out.println("Producer produced: " + value);
            notify(); // Notify consumer
        }

        public synchronized void consume() {
            while (list.isEmpty()) {
                try {
                    System.out.println("Buffer empty, consumer waiting...");
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int value = list.removeFirst();
            System.out.println("Consumer consumed: " + value);
            notify(); // Notify producer
        }
    }
}
