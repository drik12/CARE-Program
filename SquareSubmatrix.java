import java.util.Scanner;

class MatrixOperations {

    void printSquareSubmatrices(int[][] arr,
                                int r,
                                int c) {

        int limit = Math.min(r, c);

        // Square sizes
        for (int size = 1; size <= limit; size++) {

            System.out.println(
                "\nSquare Submatrices of Size "
                + size + "x" + size);

            // Traverse matrix
            for (int i = 0;
                 i + size <= r;
                 i += size) {

                for (int j = 0;
                     j + size <= c;
                     j += size) {

                    // Print submatrix
                    for (int x = i;
                         x < i + size;
                         x++) {

                        for (int y = j;
                             y < j + size;
                             y++) {

                            System.out.print(
                                arr[x][y] + " ");
                        }

                        System.out.println();
                    }

                    System.out.println();
                }
            }
        }
    }
}

public class SquareSubmatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter Rows: ");
        int r = sc.nextInt();

        System.out.print("Enter Columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        // Input matrix
        System.out.println("Enter Matrix:");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        // Create object
        MatrixOperations s =
                new MatrixOperations();

        // Call method
        s.printSquareSubmatrices(arr, r, c);

        sc.close();
    }
}