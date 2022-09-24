package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterTest {
    private AtomicInteger counter=new AtomicInteger();
    private int counterInt =0;
    private Integer counterInteger =0;

    public static void main(String[] args) {
        AtomicCounterTest act = new AtomicCounterTest();
        act.experiment();
    }

    public void experiment(){
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        executorService.execute(this::runInt);
        executorService.execute(this::runInt);
        executorService.execute(this::runInt);
        executorService.execute(this::runInt);

        executorService.execute(this::run);
        executorService.execute(this::run);
        executorService.execute(this::run);
        executorService.execute(this::run);

        executorService.shutdown();
    }

    private void run() {
        do{
        }while ( counter.getAndIncrement() < 1000_000_000);
        System.out.println(Thread.currentThread().getName() + ": " + counter.get());
    }

    private void runInt() {
        do counterInt++; while (counterInt < 1000_000_000);
        System.out.println(Thread.currentThread().getName() + ": " + counterInt);
    }
}
