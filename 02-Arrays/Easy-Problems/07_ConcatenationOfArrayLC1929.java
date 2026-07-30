/*
 * Problem:
 * Given an integer array `nums`,
 * return an array consisting of `nums`
 * concatenated with itself.
 *
 * Example:
 * Input: nums = [1,2,1]
 * Output: [1,2,1,1,2,1]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public int[] getConcatenation(int[] nums) {

    int n = nums.length;
    int[] ans = new int[2 * n];

    // Traverse the array
    for (int i = 0; i < n; i++) {
        ans[i] = nums[i];
        ans[i + n] = nums[i];
    }

    return ans;
}