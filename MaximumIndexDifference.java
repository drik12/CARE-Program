class ArrayOperations {

    int maxIndexDiff(int[] arr) {

        int n = arr.length;

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // Build leftMin array
        leftMin[0] = arr[0];

        for (int i = 1; i < n; i++) {

            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
        }

        // Build rightMax array
        rightMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        int i = 0;
        int j = 0;

        int maxDiff = 0;

        // Traverse both arrays
        while (i < n && j < n) {

            if (leftMin[i] < rightMax[j]) {

                maxDiff = Math.max(maxDiff, j - i);

                j++;
            }
            else {

                i++;
            }
        }

        return maxDiff;
    }
}

public class MaximumIndexDifference {

    public static void main(String[] args) {

        // Create object
        ArrayOperations s = new ArrayOperations();

        // Define array
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};

        // Call method
        int result = s.maxIndexDiff(arr);

        // Display result
        System.out.println("Maximum Difference = " + result);
    }
}