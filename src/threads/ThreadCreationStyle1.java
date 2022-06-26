package practice.threads;

public class ThreadCreationStyle1 {
    public static void main(String[] args) {
        new Thread(()->{
            for(int i=0;i<10;i++) {
                System.out.println("test");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
