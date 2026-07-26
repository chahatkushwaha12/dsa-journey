/*
 * Problem:
 * Given an integer num, reverse its digits twice and return true
 * if the final number is equal to the original number.
 * Otherwise, return false.
 *
 * Example 1:
 * Input: num = 526
 * Output: true
 * Explanation: 526 -> 625 -> 526
 *
 * Example 2:
 * Input: num = 1800
 * Output: false
 * Explanation: 1800 -> 81 -> 18
 *
 * Example 3:
 * Input: num = 0
 * Output: true
 *
 * Optimal Approach
 *
 * Observation:
 * - Reversing a number removes leading zeros.
 * - If a number ends with 0 (except 0 itself),
 *   those zeros are lost after the first reversal.
 * - Therefore, only numbers that do not end with 0
 *   (or the number 0 itself) remain unchanged after
 *   two reversals.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public boolean isSameAfterReversals(int num) {

    // Return true if the number is 0
    // or it does not end with a trailing zero.
    return num == 0 || num % 10 != 0;
}