class MatrixOperations {

    int subMatrixSum(int[][] arr,
                     int n,
                     int m,
                     int x1,
                     int y1,
                     int x2,
                     int y2) {

        int sum = 0;

        // Traverse submatrix
        for (int i = x1 - 1; i <= x2 - 1; i++) {

            for (int j = y1 - 1; j <= y2 - 1; j++) {

                sum += arr[i][j];
            }
        }

        return sum;
    }
}

public class SubMatrixSum {

    public static void main(String[] args) {

        // Create object
        MatrixOperations s = new MatrixOperations();

        // Define matrix
        int[][] arr = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30}
        };

        int n = 5;
        int m = 6;

        int x1 = 3;
        int y1 = 4;
        int x2 = 4;
        int y2 = 5;

        // Call method
        int result = s.subMatrixSum(arr, n, m, x1, y1, x2, y2);

        // Display result
        System.out.println("Submatrix Sum = " + result);
    }
}