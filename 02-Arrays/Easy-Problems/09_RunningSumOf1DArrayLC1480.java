/*
 * Problem:
 * Given an integer array `nums`,
 * return the running sum of the array.
 *
 * The running sum of an array is defined as:
 * runningSum[i] = nums[0] + nums[1] + ... + nums[i]
 *
 * Example 1:
 * Input: nums = [1, 2, 3, 4]
 * Output: [1, 3, 6, 10]
 *
 * Example 2:
 * Input: nums = [1, 1, 1, 1, 1]
 * Output: [1, 2, 3, 4, 5]
 */

/*
 * Brute Force Approach
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public static int[] runningSumBrute(int[] nums){
    int n = nums.length;

    // Create a new array to store the running sums
    int[] ans = new int[n];

    // The running sum of the first element is the element itself
    ans[0] = nums[0];

    // Compute the running sum for the remaining elements
    for(int i=1;i<n;i++){

        // Current running sum = previous running sum + current element
        ans[i] = ans[i-1] + nums[i];
    }
    return ans;
}

/*
 * Optimal Approach
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public static int[] runningSumOpt(int[] nums){
    int n = nums.length;

    // Traverse the array from the second element
    for(int i=1;i<n;i++){

        // Add the previous running sum to the current element
        nums[i] = nums[i] + nums[i-1];
    }
    return nums;
}