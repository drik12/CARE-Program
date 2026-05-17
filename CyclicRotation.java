import java.util.Arrays;

class ArrayOperations {

    int[] rotateArray(int[] arr, int k) {

        int n = arr.length;

        // If array has only one element
        if (n <= 1) {
            return arr;
        }

        int[] result = new int[n];

        // Keep first element unchanged
        result[0] = arr[0];

        int size = n - 1;

        // Reduce extra rotations
        k = k % size;

        // Rotate remaining elements
        for (int i = 1; i < n; i++) {

            int newIndex =
                ((i - 1 + k) % size) + 1;

            result[newIndex] = arr[i];
        }

        return result;
    }
}

public class CyclicRotation {

    public static void main(String[] args) {

        // Create object
        ArrayOperations s = new ArrayOperations();

        // Define array
        int[] arr = {1, 2, 3, 4, 5};

        int k = 2;

        // Call method
        int[] result = s.rotateArray(arr, k);

        // Display result
        System.out.println("Rotated Array = " +
                           Arrays.toString(result));
    }
}