class Array{
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 9, 8}
        };
        int diagonalSum = 0, secondarySum = 0;
        for (int i = 0; i < matrix.length; i++) {
            diagonalSum += matrix[i][i];
            secondarySum += matrix[i][matrix.length - 1 - i];
        }
        System.out.println("Primary Diagonal Sum: " + diagonalSum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }
}
