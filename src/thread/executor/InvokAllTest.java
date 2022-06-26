package thread.executor;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class InvokAllTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        /* 10 sec clock */
        executorService.execute(()->{for(int i=0;i<10;i++) {System.out.println(i);try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}}});
        Set<Callable<String>> callables = new HashSet<>();
        callables.add(InvokAllTest.myCallable("Task1"));
        callables.add(InvokAllTest.myCallable("Task2"));
        callables.add(InvokAllTest.myCallable("Task3"));
        callables.add(InvokAllTest.myCallable("Task4"));

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
            Long random = Math.round(Math.random()*5000);
            System.out.println(Thread.currentThread().getName()+":"+msg+" Started. will take "+random+" millSec.");
            try {Thread.sleep(random);} catch (InterruptedException e) {
                System.out.println(""+Thread.currentThread().getName()+" cancelled.");
                e.printStackTrace();
            }
            return Thread.currentThread().getName()+":"+msg+" Completed. took "+random+" millSec.";
        };
    }
}
