class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread extending: " + i);
            try {
                Thread.sleep(500);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable implementing: " + i);
            try {
                Thread.sleep(500);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();   // Thread using extends
        Thread t2 = new Thread(new MyRunnable()); // Thread using Runnable

        t1.start();
        t2.start();
    }
}
