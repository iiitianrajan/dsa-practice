package Arrays.MaximumSubarray;

// Problem: Maximum Subarray Sum
// Approach: Brute Force
// Time Complexity: O(n^3)
// Space Complexity: O(n^2)

public class maximum_subarray_bruteforce {

    public static void maxSubArraySum(int[] arr) {

        int a[] = new int[(arr.length * (arr.length + 1)) / 2];

        int sum = 0;
        int k = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int j2 = i; j2 <= j; j2++) {

                    System.out.print(arr[j2] + " ");

                    sum = sum + arr[j2];
                }

                System.out.print("\t");

                a[k] = sum;

                sum = 0;

                k++;
            }

            System.out.println();
        }

        System.out.print("Subarray sum values: ");

        for (int i = 0; i < (arr.length * (arr.length + 1)) / 2; i++) {

            System.out.print(a[i] + " ");
        }

        System.out.println();

        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < (arr.length * (arr.length + 1)) / 2; i++) {

            if (maximum < a[i]) {

                maximum = a[i];
            }
        }

        System.out.println("Maximum Subarray Sum: " + maximum);
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        maxSubArraySum(arr);
    }
}