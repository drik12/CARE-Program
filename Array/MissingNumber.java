class ArrayOperations {

    int missingNumber(int[] arr) {

        int n = arr.length + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {

            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }
}

public class MissingNumber {

    public static void main(String[] args) {

        // Create object
        ArrayOperations s = new ArrayOperations();

        // Define array
        int[] arr = {1, 2, 3, 5};

        // Call method
        int result = s.missingNumber(arr);

        // Display result
        System.out.println("Missing Number = " + result);
    }
}