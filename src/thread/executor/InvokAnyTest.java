package thread.executor;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class InvokAnyTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        /* 10 sec clock */
        executorService.execute(()->{for(int i=0;i<10;i++) {System.out.println(i);try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}}});
        Set<Callable<String>> callables = new HashSet<>();
        callables.add(InvokAnyTest.myCallable("Task1"));
        callables.add(InvokAnyTest.myCallable("Task2"));
        callables.add(InvokAnyTest.myCallable("Task3"));
        callables.add(InvokAnyTest.myCallable("Task4"));

        String result = executorService.invokeAny(callables);
        System.out.println(result);

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
