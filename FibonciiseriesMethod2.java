import java.util.Scanner;

public class Fiboncii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
           System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        sc.close();
       
    }
}
