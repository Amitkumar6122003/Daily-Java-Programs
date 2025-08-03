public class SimpleJavaExample {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            if (isEven(i)) {
                System.out.println(i);
            }
        }
    }
}