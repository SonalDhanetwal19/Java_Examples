import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {
    public static void  main(String[] args)
    {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);
        System.out.println("Inside Main thread - Producer-consumer problem");
        Thread producer = new Producer("Producer",blockingQueue,10);
        Thread consumer = new Consumer("Consumer", blockingQueue, 10);
        producer.start();
        consumer.start();
    }
}

