import java.util.Arrays;

class ArrayOps {

    int[] removeDuplicates(int[] arr) {

        int n = arr.length;

        // Edge case
        if (n == 0) {
            return new int[0];
        }

        int index = 0;

        // Traverse array
        for (int i = 1; i < n; i++) {

            if (arr[i] != arr[index]) {

                index++;

                arr[index] = arr[i];
            }
        }

        // Create result array
        int[] result = new int[index + 1];

        for (int i = 0; i <= index; i++) {

            result[i] = arr[i];
        }

        return result;
    }
}

public class RemoveDuplicates {

    public static void main(String[] args) {

        // Create object
        ArrayOps s = new ArrayOps();

        // Define array
        int[] arr = {2, 2, 2, 2, 2};

        // Call method
        int[] result = s.removeDuplicates(arr);

        // Display result
        System.out.println("Distinct Array = " +
                           Arrays.toString(result));
    }
}