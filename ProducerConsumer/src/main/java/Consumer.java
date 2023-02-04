import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread{
    private BlockingQueue<Integer> blockingQueue;
    private int qSize;

    Consumer(String name, BlockingQueue<Integer> queue, int size)
    {
        super(name);
        this.blockingQueue =  queue;
        this.qSize = size;
    }

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (blockingQueue)
            {
                while(blockingQueue.isEmpty())
                {
                    try {
                        System.out.println("Queue is empty. Consumer waiting for producer to add an element in the queue");
                        blockingQueue.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("retrieving element from blocking queue : "+blockingQueue.remove());
                blockingQueue.notifyAll();
            }
        }
    }

}
