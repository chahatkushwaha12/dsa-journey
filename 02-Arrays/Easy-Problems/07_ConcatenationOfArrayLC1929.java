/*
 * Problem:
 * Given an integer array `nums` of length `n`,
 * create an array `ans` of length `2n` where:
 *
 * - ans[i] = nums[i]
 * - ans[i + n] = nums[i]
 *
 * Return the array `ans`.
 *
 * Example:
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
// Returns the concatenation of the given array with itself
public int[] getConcatenation(int[] nums) {

    int n = nums.length;
    int[] ans = new int[2 * n];

    // Copy the array twice
    for (int i = 0; i < n; i++) {
        ans[i] = nums[i];
        ans[i + n] = nums[i];
    }

    return ans;
}