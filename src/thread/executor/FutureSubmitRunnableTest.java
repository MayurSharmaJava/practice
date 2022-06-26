package practice.thread.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureSubmitRunnableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        /* 10 sec clock */
        executorService.execute(()->{for(int i=0;i<10;i++) {System.out.println(i);try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}}});

        Future<?> future = executorService.submit(FutureSubmitRunnableTest.myRunnable("task aggregate."));

        //-- once you get Future Object then main thread continues.
        System.out.println("is done ? "+future.isDone());

        System.out.println("Main Thread is Performing heavy task");
        Thread.sleep(3000L);
        System.out.println("Main Done.");

        future.get();//--Waiting for task Aggregate to Complete

        System.out.println("is done ? "+future.isDone());
        System.out.println("finally completed.");


        executorService.shutdown();
    }

    public static Runnable myRunnable(String msg){
        return ()->{
            System.out.println(Thread.currentThread().getName()+":"+msg+" Started.");
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
}
