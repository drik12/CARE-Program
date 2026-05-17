import java.util.Arrays;

class ArrayOp {

    void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    void leftRotate(int[] arr, int d) {

        int n = arr.length;

        d = d % n;

        // Reverse first d elements
        reverse(arr, 0, d - 1);

        // Reverse remaining elements
        reverse(arr, d, n - 1);

        // Reverse whole array
        reverse(arr, 0, n - 1);
    }
}

public class LeftRotate {

    public static void main(String[] args) {

        // Create object
        ArrayOp s = new ArrayOp();

        // Define array
        int[] arr = {1, 2, 3, 4, 5};

        int d = 2;

        // Call method
        s.leftRotate(arr, d);

        // Display result
        System.out.println("Rotated Array = " + Arrays.toString(arr));
    }
}