package Arrays.MaximumSubarray;

// Problem: Maximum Subarray Sum
// Approach: Kadane's Algorithm (Optimal)
// Time Complexity: O(n)
// Space Complexity: O(1)

public class maximum_subarray_kadane {

    public static void maxSubArray(int[] arr) {

        int currentSum = arr[0];
        int maximumSum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            // Either extend previous subarray
            // or start new subarray
            currentSum = Math.max(currentSum + arr[i], arr[i]);

            // Update maximum sum
            maximumSum = Math.max(maximumSum, currentSum);
        }

        System.out.println("Maximum Subarray Sum: " + maximumSum);
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        maxSubArray(arr);
    }
}