public class DiagonalDifference {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(calculateDiagonalDifference(matrix1));
        int[][] matrix2 = {
                {1, 2, 3, 4, 7},
                {5, 5, 5, 5, 2},
                {1, 1, 0, 0, 0},
                {0, 2, 3, 4, 1},
                {0, 1, 1, 2, 2},
        };
        System.out.println(calculateDiagonalDifference(matrix2));
        int[][] matrix3 = {
                {2,5,7,8},
                {3,2,3,9},
                {4,4,8,8},
        };
        System.out.println(calculateDiagonalDifference(matrix3));
    }

    static int calculateDiagonalDifference(int[][] matrix) {
        int number = matrix.length;
        int diagonalSum1 = 0;
        int diagonalSum2 = 0;
        for (int i = 0; i < number; i++) {
            diagonalSum1 += matrix[i][i];
            diagonalSum2 += matrix[i][number - i - 1];
        }
        return diagonalSum1 - diagonalSum2;
    }
}
