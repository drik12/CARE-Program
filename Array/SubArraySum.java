import java.util.ArrayList;

class ArrayOpts {

    ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> result = new ArrayList<>();

        int start = 0;

        int currentSum = 0;

        for (int end = 0; end < arr.length; end++) {

            currentSum += arr[end];

            while (currentSum > target && start <= end) {

                currentSum -= arr[start];

                start++;
            }

            if (currentSum == target) {

                result.add(start + 1);
                result.add(end + 1);

                return result;
            }
        }

        result.add(-1);

        return result;
    }
}

public class SubArraySum {

    public static void main(String[] args) {

        // Create object
        ArrayOpts s = new ArrayOpts();

        // Define array
        int[] arr = {1, 2, 3, 7, 5};

        int target = 12;

        // Call method
        ArrayList<Integer> result =
                s.subarraySum(arr, target);

        // Display result
        System.out.println("Subarray Indices = " + result);
    }
}