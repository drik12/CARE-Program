import java.util.*;

class ArrayOperation {

    List<List<Integer>> findPairs(int[] arr) {

        HashSet<Integer> seen = new HashSet<>();

        HashSet<String> uniquePairs = new HashSet<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = -arr[i];

            if (seen.contains(complement)) {

                int first = Math.min(arr[i], complement);
                int second = Math.max(arr[i], complement);

                String pair = first + "," + second;

                if (!uniquePairs.contains(pair)) {

                    uniquePairs.add(pair);

                    List<Integer> temp = new ArrayList<>();

                    temp.add(first);
                    temp.add(second);

                    result.add(temp);
                }
            }

            seen.add(arr[i]);
        }

        Collections.sort(result, (a, b) -> {

            if (!a.get(0).equals(b.get(0))) {
                return a.get(0) - b.get(0);
            }

            return a.get(1) - b.get(1);
        });

        return result;
    }
}

public class ZeroSumPairs {

    public static void main(String[] args) {

        // Create object
        ArrayOperation s = new ArrayOperation();

        // Define array
        int[] arr = {-1, 0, 1, 2, -1, -4};

        // Call method
        List<List<Integer>> result = s.findPairs(arr);

        // Display result
        System.out.println("Unique Pairs = " + result);
    }
}