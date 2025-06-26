class SharedBuffer {
    private int[] buffer;
    private int capacity;
    private int count;
    private int in;
    private int out;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new int[capacity];
        this.count = 0;
        this.in = 0;
        this.out = 0;
    }

    public void produce(int item) {
        if (count < capacity) {
            buffer[in] = item;
            in = (in + 1) % capacity;
            count++;
            System.out.println("Produced: " + item);
        }
    }

    public int consume() {
        if (count > 0) {
            int item = buffer[out];
            out = (out + 1) % capacity;
            count--;
            System.out.println("Consumed: " + item);
            return item;
        }
        return -1; // Indicates buffer is empty
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);
        int item = 1;

        for (int i = 0; i < 5; i++) { // Simulating 10 production-consumption cycles
            buffer.produce(item++);
            buffer.consume();
        }
    }
}
