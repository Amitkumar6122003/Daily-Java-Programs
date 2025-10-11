class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {45, 12, 78, 34, 89, 23};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Largest element: " + first);
        System.out.println("Second largest element: " + second);
    }
}
