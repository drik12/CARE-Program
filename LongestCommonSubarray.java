import java.util.Scanner;

class ArrayOperations {

    void longestCommonSubarray(int[] a1,
                               int[] a2,
                               int m,
                               int n) {

        int[][] dp = new int[m + 1][n + 1];

        int maxLength = 0;

        int endIndex = 0;

        // Build DP table
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (a1[i - 1] == a2[j - 1]) {

                    dp[i][j] =
                        dp[i - 1][j - 1] + 1;

                    // Update maximum
                    if (dp[i][j] > maxLength) {

                        maxLength = dp[i][j];

                        endIndex = i;
                    }
                }
            }
        }

        // Print longest common subarray
        System.out.println(
            "Longest Common Subarray:");

        for (int i = endIndex - maxLength;
                 i < endIndex;
                 i++) {

            System.out.print(a1[i] + " ");
        }
    }
}

public class LongestCommonSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter M: ");

        int m = sc.nextInt();

        int[] a1 = new int[m];

        // Input first array
        System.out.println(
            "Enter elements of A1:");

        for (int i = 0; i < m; i++) {

            a1[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter N: ");

        int n = sc.nextInt();

        int[] a2 = new int[n];

        // Input second array
        System.out.println(
            "Enter elements of A2:");

        for (int i = 0; i < n; i++) {

            a2[i] = sc.nextInt();
        }

        // Create object
        ArrayOperations s =
                new ArrayOperations();

        // Call method
        s.longestCommonSubarray(a1, a2, m, n);

        sc.close();
    }
}