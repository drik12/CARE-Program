import java.util.Scanner;

class KnapsackOperations {

    int findMaximumValue(int[] weight, int[] value, int N, int C) {

        int[][] dp = new int[N + 1][C + 1];

        // Build DP table
        for (int i = 1; i <= N; i++) {

            for (int w = 1; w <= C; w++) {

                // If item can be included
                if (weight[i - 1] <= w) {

                    int include =
                            value[i - 1]
                            + dp[i - 1][w - weight[i - 1]];

                    int exclude = dp[i - 1][w];

                    dp[i][w] = Math.max(include, exclude);
                }

                // Cannot include item
                else {

                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[N][C];
    }
}

public class KnapsackProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of items
        System.out.print("Enter number of items: ");

        int N = sc.nextInt();

        // Input capacity
        System.out.print("Enter truck capacity: ");

        int C = sc.nextInt();

        int[] weight = new int[N];
        int[] value = new int[N];

        // Input weights
        System.out.println("Enter weights:");

        for (int i = 0; i < N; i++) {

            weight[i] = sc.nextInt();
        }

        // Input values
        System.out.println("Enter values:");

        for (int i = 0; i < N; i++) {

            value[i] = sc.nextInt();
        }

        // Create object
        KnapsackOperations obj =
                new KnapsackOperations();

        // Find answer
        int result =
                obj.findMaximumValue(weight,
                                     value,
                                     N,
                                     C);

        // Display result
        System.out.println(
                "Maximum Value = " + result);

        sc.close();
    }
}