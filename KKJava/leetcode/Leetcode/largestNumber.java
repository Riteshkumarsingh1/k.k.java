import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Example input
        int[] nums = { 3, 30, 34, 5, 9 };

        // Call method
        String result = largestNumber(nums);

        // Print result
        System.out.println("Largest Number: " + result);
    }

    public static String largestNumber(int[] nums) {

        // Step 1: Convert integers to strings
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Step 2: Custom sorting
        Arrays.sort(arr, (a, b) -> {
            // Compare two possible concatenations
            String option1 = a + b;
            String option2 = b + a;

            // Sort in descending order
            return option2.compareTo(option1);
        });

        // Step 3: Edge case - if highest element is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Step 4: Build final result
        StringBuilder result = new StringBuilder();
        for (String num : arr) {
            result.append(num);
        }

        return result.toString();
    }
}