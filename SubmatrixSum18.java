import java.util.Scanner;

class MatrixOperations {

    void printSubmatrixSums(int[][] arr,
                            int r,
                            int c,
                            int x,
                            int y) {

        // Traverse matrix
        for (int i = 0;
                 i + x <= r;
                 i += x) {

            for (int j = 0;
                     j + y <= c;
                     j += y) {

                int sum = 0;

                // Calculate sum of X*Y block
                for (int a = i;
                         a < i + x;
                         a++) {

                    for (int b = j;
                             b < j + y;
                             b++) {

                        sum += arr[a][b];
                    }
                }

                // Print sum
                System.out.print(sum + " ");
            }
        }
    }
}

public class SubmatrixSum18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter R and C: ");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        // Input matrix
        System.out.println("Enter Matrix:");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

        // Input X and Y
        System.out.print("Enter X and Y: ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        // Create object
        MatrixOperations s =
                new MatrixOperations();

        // Call method
        s.printSubmatrixSums(arr,
                             r,
                             c,
                             x,
                             y);

        sc.close();
    }
}