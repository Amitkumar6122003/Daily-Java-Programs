public class ArrayFindsecondnumber {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 45, 7};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("Second largest number is: " + second);
        }
    }
}
