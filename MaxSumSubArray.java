class ArrayOperations {

    int maxSubArray(int[] arr) {

        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

public class MaxSumSubArray {

    public static void main(String[] args) {

        // Create object
        ArrayOperations s = new ArrayOperations();

        // Define array
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        // Call method
        int result = s.maxSubArray(arr);

        // Display result
        System.out.println("Maximum Sum = " + result);
    }
}