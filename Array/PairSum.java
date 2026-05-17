import java.util.HashSet;

class ArrayOperations {

    boolean hasPairWithTarget(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (set.contains(complement)) {
                return true;
            }

            set.add(arr[i]);
        }

        return false;
    }
}

public class PairSum {

    public static void main(String[] args) {

        // Create object
        ArrayOperations s = new ArrayOperations();

        // Define array
        int[] arr = {0, -1, 2, -3, 1};

        int target = -2;

        // Call method
        boolean result = s.hasPairWithTarget(arr, target);

        // Display result
        System.out.println("Pair Exists = " + result);
    }
}