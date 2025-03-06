package Multithreading_Day14;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Message {
    private String sender;
    private String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + sender + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

class Producer implements Runnable {
    private final BlockingQueue<Message> queue;
    private final String sender;

    public Producer(BlockingQueue<Message> queue, String sender) {
        this.queue = queue;
        this.sender = sender;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Message message = new Message(sender, "Message " + i);
                queue.put(message); // Add message to the queue (blocks if the queue is full)
                System.out.println(sender + " sent: " + message.getContent());
                Thread.sleep(500); // Simulate time taken to send a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final BlockingQueue<Message> queue;

    public Consumer(BlockingQueue<Message> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Message message = queue.take(); // Take a message from the queue (blocks if the queue is empty)
                System.out.println("Processed: " + message);
                Thread.sleep(1000); // Simulate time taken to process a message
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class BlockingQueueMessageProcessingSystem {
    public static void main(String[] args) {
        // Create a BlockingQueue with a capacity of 10
        BlockingQueue<Message> queue = new LinkedBlockingQueue<>(10);

        // Create producers (users)
        Thread user1 = new Thread(new Producer(queue, "User1"));
        Thread user2 = new Thread(new Producer(queue, "User2"));

        // Create consumers (workers)
        Thread worker1 = new Thread(new Consumer(queue));
        Thread worker2 = new Thread(new Consumer(queue));

        // Start producers and consumers
        user1.start();
        user2.start();
        worker1.start();
        worker2.start();
    }
}