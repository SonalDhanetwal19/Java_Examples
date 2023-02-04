import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomThreadPoolExecutor extends ThreadPoolExecutor {
    Diary diary = new Diary();
    public CustomThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    @Override
    public void beforeExecute(Thread t, Runnable r) {
        System.out.println("Inside before execute method"+t.getName());
        if(t==null || r == null)
        {
            throw new NullPointerException();
        }
        diary.setCurrentDay(Day.MONDAY);
        super.beforeExecute(t,r);
    }
}