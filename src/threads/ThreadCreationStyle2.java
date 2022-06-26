package threads;

public class ThreadCreationStyle2 {
    public static void main(String[] args) {
        new Thread(ThreadCreationStyle2::run).start();
    }

    private static void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("test");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}