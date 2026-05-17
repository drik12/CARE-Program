import java.util.Scanner;

class MatrixOperations {

    boolean isTransposePresent(char[][] m1,
                               char[][] transpose,
                               int r,
                               int c,
                               int k) {

        // Traverse M1
        for (int i = 0; i <= r - k; i++) {

            for (int j = 0; j <= c - k; j++) {

                boolean match = true;

                // Compare K x K matrix
                for (int x = 0; x < k; x++) {

                    for (int y = 0; y < k; y++) {

                        if (m1[i + x][j + y]
                                != transpose[x][y]) {

                            match = false;

                            break;
                        }
                    }

                    if (!match) {
                        break;
                    }
                }

                // Match found
                if (match) {
                    return true;
                }
            }
        }

        return false;
    }
}

public class MatrixTransposeSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter R and C: ");

        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] m1 = new char[r][c];

        // Input M1
        System.out.println("Enter Matrix M1:");

        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {

                m1[i][j] = sc.next().charAt(0);
            }
        }

        // Input K
        System.out.print("Enter K: ");

        int k = sc.nextInt();

        char[][] m2 = new char[k][k];

        // Input M2
        System.out.println("Enter Matrix M2:");

        for (int i = 0; i < k; i++) {

            for (int j = 0; j < k; j++) {

                m2[i][j] = sc.next().charAt(0);
            }
        }

        // Find transpose
        char[][] transpose = new char[k][k];

        for (int i = 0; i < k; i++) {

            for (int j = 0; j < k; j++) {

                transpose[i][j] = m2[j][i];
            }
        }

        // Create object
        MatrixOperations s =
                new MatrixOperations();

        boolean found =
            s.isTransposePresent(
                m1,
                transpose,
                r,
                c,
                k
            );

        // Output
        if (found) {

            System.out.println(
                "\nMatrix M2:");

            for (int i = 0; i < k; i++) {

                for (int j = 0; j < k; j++) {

                    System.out.print(
                        m2[i][j] + " ");
                }

                System.out.println();
            }
        }
        else {

            System.out.println("-1");
        }

        sc.close();
    }
}