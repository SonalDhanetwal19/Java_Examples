import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer extends Thread{
    private BlockingQueue<Integer> blockingQueue;
    private int maxSize;

    Producer(String name, BlockingQueue<Integer> queue, int qSize)
    {
        super(name);
        this.blockingQueue = queue;
        this.maxSize=qSize;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (blockingQueue)
            {
                while (blockingQueue.size() == maxSize)
                {
                    try {
                        System.out.println("Queue is full. Producer waiting for consumer to retrieve from the queue");
                        blockingQueue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                Random randomInt = new Random();
                int i = randomInt.nextInt();
                System.out.println(" producing value : "+i);
                blockingQueue.offer(i);
                blockingQueue.notifyAll();
            }
        }
    }

}