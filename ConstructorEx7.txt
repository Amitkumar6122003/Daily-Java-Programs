class ArraySort {
    public static void main(String[] args) {
        int arr[] = {50, 10, 40, 20, 60, 30};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array in Ascending Order:");
        for (int n : arr) {
            System.out.print(n + " ");
        }


        System.out.println("\nArray in Descending Order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
