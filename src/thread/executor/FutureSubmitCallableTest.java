package thread.executor;

import java.util.concurrent.*;

public class FutureSubmitCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        /* 10 sec clock */
        executorService.execute(()->{for(int i=0;i<10;i++) {System.out.println(i);try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}}});

        Future<?> future = executorService.submit(FutureSubmitCallableTest.myCallable("task aggregate."));

        //-- once you get Future Object then main thread continues.
        System.out.println("is done ? "+future.isDone());
        System.out.println("Main Thread is Performing heavy task");
        Thread.sleep(3000L);
        System.out.println("Main Done.");

        String str = (String) future.get();//--Waiting for task Aggregate to Complete
        System.out.println("thread Output is: "+str);

        System.out.println("is done ? "+future.isDone());
        System.out.println("finally completed.");


        executorService.shutdown();
    }

    public static Callable myCallable(String msg){
        return ()->{
            try {Thread.sleep(5000L);} catch (InterruptedException e) {e.printStackTrace();}
            return Thread.currentThread().getName()+":"+msg+" Started.";
        };
    }
}
