
class PermutationTask implements Runnable {
    private String prefix;
    private String remaining;
    private static final Object lock = new Object();
    private static int count = 0;

    public PermutationTask(String prefix, String remaining) {
        this.prefix = prefix;
        this.remaining = remaining;
    }

    @Override
    public void run() {
        if (remaining.length() == 0) {
            synchronized (lock) {
                count++;
                System.out.println(Thread.currentThread().getName() + " → " + prefix);
            }
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String newPrefix = prefix + remaining.charAt(i);
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                Thread t = new Thread(new PermutationTask(newPrefix, newRemaining));
                t.start();

                try {
                    t.join(); // Wait for this thread to complete before moving on
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static int getCount() {
        synchronized (lock) {
            return count;
        }
    }
}

public class MultithreadedPermutation {
    public static void main(String[] args) {
        String input = "ABC";
        Thread mainThread = new Thread(new PermutationTask("", input));
        mainThread.start();

        try {
            mainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nTotal permutations generated: " + PermutationTask.getCount());
    }
}
