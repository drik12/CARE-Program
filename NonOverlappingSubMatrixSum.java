import java.util.Scanner;

class MatrixOperation {

    void printSubMatrixSums(int[][] arr, int R, int C, int X, int Y) {

        for (int i = 0; i <= R - X; i += X) {

            for (int j = 0; j <= C - Y; j += Y) {

                int sum = 0;

                // Traverse X*Y submatrix
                for (int r = i; r < i + X; r++) {

                    for (int c = j; c < j + Y; c++) {

                        sum += arr[r][c];
                    }
                }

                System.out.println(sum);
            }
        }
    }
}

public class NonOverlappingSubMatrixSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter R and C: ");

        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] arr = new int[R][C];

        // Input matrix
        System.out.println("Enter Matrix:");

        for (int i = 0; i < R; i++) {

            for (int j = 0; j < C; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        // Input X and Y
        System.out.print("Enter X and Y: ");

        int X = sc.nextInt();
        int Y = sc.nextInt();

        // Create object
        MatrixOperation obj = new MatrixOperation();

        // Call method
        obj.printSubMatrixSums(arr, R, C, X, Y);

        sc.close();
    }
}