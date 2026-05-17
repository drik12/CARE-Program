import java.util.Arrays;

class ArrayOpt {

    int[] findUniqueNumbers(int[] arr) {

        int xor = 0;

        // XOR all elements
        for (int i = 0; i < arr.length; i++) {

            xor ^= arr[i];
        }

        // Find rightmost set bit
        int setBit = xor & (-xor);

        int num1 = 0;
        int num2 = 0;

        // Divide into two groups
        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] & setBit) != 0) {
                num1 ^= arr[i];
            }
            else {
                num2 ^= arr[i];
            }
        }

        int[] result = {num1, num2};

        Arrays.sort(result);

        return result;
    }
}

public class FindTwoUnique {

    public static void main(String[] args) {

        // Create object
        ArrayOpt s = new ArrayOpt();

        // Define array
        int[] arr = {1, 2, 3, 2, 1, 4};

        // Call method
        int[] result = s.findUniqueNumbers(arr);

        // Display result
        System.out.println("Unique Numbers = " +
                           Arrays.toString(result));
    }
}