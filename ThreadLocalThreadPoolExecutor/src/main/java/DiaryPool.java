import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

//refer to link for threadpool example using threadpool executor : https://wiki.sei.cmu.edu/confluence/display/java/TPS04-J.+Ensure+ThreadLocal+variables+are+reinitialized+when+using+thread+pools
public final class DiaryPool {
    final int numOfThreads = 2;
    final Executor executor;
    final Diary diary;

    public DiaryPool() {
        this.executor = new CustomThreadPoolExecutor(numOfThreads,numOfThreads,10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));
        this.diary = new Diary();
    }

    public void method1()
    {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                diary.setCurrentDay(Day.FRIDAY);
                diary.printDay(diary.getCurrentDay());
            }
        });
    }
    public void method2()
    {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                diary.getCurrentDay();
                diary.printDay(diary.getCurrentDay());
            }
        });
    }
    public static void main(String[] args)
    {
        DiaryPool diaryPool = new DiaryPool();
        diaryPool.method1();
        diaryPool.method2();
        diaryPool.method2();
    }
}
