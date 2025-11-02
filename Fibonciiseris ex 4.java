import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciMatrix {
    static BigInteger[][] multiply(BigInteger[][] A, BigInteger[][] B) {
        BigInteger[][] C = new BigInteger[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                C[i][j] = A[i][0].multiply(B[0][j]).add(A[i][1].multiply(B[1][j]));
        return C;
    }

    static BigInteger[][] power(BigInteger[][] M, int n) {
        if (n == 1) return M;
        if (n % 2 == 0) {
            BigInteger[][] half = power(M, n / 2);
            return multiply(half, half);
        } else {
            return multiply(M, power(M, n - 1));
        }
    }

    static BigInteger fib(int n) {
        if (n == 0) return BigInteger.ZERO;
        BigInteger[][] F = { { BigInteger.ONE, BigInteger.ONE }, { BigInteger.ONE, BigInteger.ZERO } };
        BigInteger[][] result = power(F, n - 1);
        return result[0][0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++)
            System.out.print(fib(i) + " ");
    }
}
