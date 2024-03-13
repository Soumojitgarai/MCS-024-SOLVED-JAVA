public class ProducerConsumer {
    private int item;
    private boolean available = false;

    public synchronized void put(int item) throws InterruptedException {
        while (available) {
            wait();
        }
        this.item = item;
        available = true;
        notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (!available) {
            wait();
        }
        available = false;
        notifyAll();
        return item;
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    pc.put(i);
                    System.out.println("Produced: " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    int item = pc.get();
                    System.out.println("Consumed: " + item);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
