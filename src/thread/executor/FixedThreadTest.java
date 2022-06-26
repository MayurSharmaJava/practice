package practice.thread.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(FixedThreadTest.myRunnable("task1"));
        executorService.execute(FixedThreadTest.myRunnable("task2"));
        executorService.execute(FixedThreadTest.myRunnable("task3"));
        executorService.execute(FixedThreadTest.myRunnable("task4"));

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
