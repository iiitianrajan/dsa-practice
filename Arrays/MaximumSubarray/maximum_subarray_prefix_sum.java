package Arrays.MaximumSubarray;

// Problem: Maximum Subarray Sum
// Approach: Prefix Sum
// Time Complexity: O(n^2)
// Space Complexity: O(n)

public class maximum_subarray_prefix_sum {

    public static void maxSubArray(int[] arr) {

        // Creating Prefix Sum Array
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maximum = Integer.MIN_VALUE;

        // Generating all subarrays
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                // Calculating subarray sum using prefix sum
                int currentSum = (i == 0)
                        ? prefix[j]
                        : prefix[j] - prefix[i - 1];

                maximum = Math.max(maximum, currentSum);
            }
        }

        System.out.println("Maximum Subarray Sum: " + maximum);
    }

    public static void main(String[] args) {

        int[] arr = {1, -2, 6, -1, 3};

        maxSubArray(arr);
    }
}