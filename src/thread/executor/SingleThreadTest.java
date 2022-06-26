package practice.thread.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(SingleThreadTest.myRunnable("task1"));
        executorService.execute(SingleThreadTest.myRunnable("task2"));
        executorService.execute(SingleThreadTest.myRunnable("task3"));
        executorService.execute(SingleThreadTest.myRunnable("task4"));

        executorService.shutdown();
    }

    public static Runnable myRunnable(String msg){
        return ()->{
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+msg);
        };
    }
}
