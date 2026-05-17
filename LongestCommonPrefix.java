class StringOperations {

    String longestCommonPrefix(String[] arr) {

        // Take first string as prefix
        String prefix = arr[0];

        // Compare with remaining strings
        for (int i = 1; i < arr.length; i++) {

            while (!arr[i].startsWith(prefix)) {

                // Remove last character
                prefix = prefix.substring(0, prefix.length() - 1);

                // No common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

public class LongestCommonPrefix {

    public static void main(String[] args) {

        // Create object
        StringOperations s = new StringOperations();

        // Define string array
        String[] arr = {
            "geeksforgeeks",
            "geeks",
            "geek",
            "geezer"
        };

        // Call method
        String result = s.longestCommonPrefix(arr);

        // Display result
        System.out.println("Longest Common Prefix = " + result);
    }
}