/*
 * Problem:
 * Given a zero-based permutation `nums` (0-indexed),
 * build an array `ans` of the same length where
 * ans[i] = nums[nums[i]].
 *
 * Return the built array.
 *
 * Example:
 * Input: nums = [0,2,1,5,3,4]
 * Output: [0,1,2,4,5,3]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public int[] buildArray(int[] nums){
    int n = nums.length;
    int[] ans = new int[n];

    // Build the new array
    for(int i = 0; i < n; i++){
        ans[i] = nums[nums[i]];
    }

    return ans;
}