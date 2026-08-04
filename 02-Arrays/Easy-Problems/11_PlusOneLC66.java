/*
 * Problem:
 * You are given a large integer represented as an integer array `digits`,
 * where each `digits[i]` is the ith digit of the integer.
 * The digits are ordered from most significant to least significant.
 *
 * Increment the large integer by one and return the resulting array.
 *
 * Example:
 * Input:  [1,2,3]
 * Output: [1,2,4]
 *
 * Input:  [9]
 * Output: [1,0]
 *
 * Optimal
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public int[] plusOne(int[] digits) {
    int n = digits.length;

    // Traverse from the last digit
    for (int i = n - 1; i >= 0; i--) {

        // If current digit is less than 9,
        // simply increment it and return
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }

        // If digit is 9, make it 0 and carry continues
        digits[i] = 0;
    }

    // If all digits were 9, create a new array
    int[] ans = new int[n + 1];
    ans[0] = 1;

    return ans;
}