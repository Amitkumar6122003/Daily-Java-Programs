import java.util.*;
import java.util.concurrent.*;

class Fibonacci {
    private static Map<Integer, Long> cache = new ConcurrentHashMap<>();

    public static long fib(int n) {
        if (n <= 1) return n;
        if (cache.containsKey(n)) return cache.get(n);
        long value = fib(n - 1) + fib(n - 2);
        cache.put(n, value);
        return value;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        ExecutorService ex = Executors.newFixedThreadPool(2);
        Future<?> f1 = ex.submit(() -> {
            for (int i = 0; i <= n / 2; i++)
                System.out.print(fib(i) + " ");
        });
        Future<?> f2 = ex.submit(() -> {
            for (int i = n / 2 + 1; i <= n; i++)
                System.out.print(fib(i) + " ");
        });

        f1.get();
        f2.get();
        ex.shutdown();
    }
}
