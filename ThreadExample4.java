class MyTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " running: " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyTask(), "Worker-1");
        Thread t2 = new Thread(new MyTask(), "Worker-2");
        t1.start();
        t2.start();
    }
}
