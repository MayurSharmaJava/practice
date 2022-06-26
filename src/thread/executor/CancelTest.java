package practice.thread.executor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class CancelTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);


        /* 10 sec clock */
        executorService.execute(()->{for(int i=0;i<=10;i++) {
            if(i==3){
                List<Runnable> runnables = executorService.shutdownNow();
                System.out.println(runnables.size()+"below are runnables which got cancelled before it starts");
                runnables.forEach(r->{
                    System.out.println(r.toString());
                });
                System.out.println("interrupting runnables which started.");
            }//-- Before any can complete
            System.out.println(i);try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}}});

        Set<Callable<String>> callables = new HashSet<>();
        callables.add(CancelTest.myCallable("Task1"));
        callables.add(CancelTest.myCallable("Task2"));
        callables.add(CancelTest.myCallable("Task3"));
        callables.add(CancelTest.myCallable("Task4"));


        List<Future<String>> futures = executorService.invokeAll(callables);
        futures.forEach(f->{
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();
    }

    public static Callable myCallable(String msg){
        return ()->{
            Long random = Math.round(Math.random()*7000);
            System.out.println(Thread.currentThread().getName()+":"+msg+" Started. will take "+random+" millSec.");
            try {Thread.sleep(random);} catch (InterruptedException e) {
                System.out.println(System.currentTimeMillis()+" "+Thread.currentThread().getName()+" cancelled.");
                e.printStackTrace();
            }
            return Thread.currentThread().getName()+":"+msg+" Completed. took "+random+" millSec.";
        };
    }
}
