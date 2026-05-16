class BinaryOperations {

    boolean isDivisibleBy3(String s) {

        int remainder = 0;

        for (int i = 0; i < s.length(); i++) {

            int bit = s.charAt(i) - '0';

            remainder = (remainder * 2 + bit) % 3;
        }

        return remainder == 0;
    }
}

public class BinaryDivisibleBy3 {

    public static void main(String[] args) {

        // Create object
        BinaryOperations s = new BinaryOperations();

        // Define binary string
        String binary = "110";

        // Call method
        boolean result = s.isDivisibleBy3(binary);

        // Display result
        System.out.println("Divisible by 3 = " + result);
    }
}