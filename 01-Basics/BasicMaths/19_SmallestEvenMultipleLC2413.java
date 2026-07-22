/*
 * Problem:
 * Given a positive integer n, return the smallest positive integer
 * that is a multiple of both 2 and n.
 *
 * Example:
 * Input: n = 5
 * Output: 10
 * Explanation: The smallest multiple of both 5 and 2 is 10.
 *
 * Input: n = 6
 * Output: 6
 * Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {
    public int smallestEvenMultiple(int n) {

        // If n is even, return n itself
        if (n % 2 == 0) {
            return n;
        }

        // Otherwise, return the next even multiple
        return n * 2;
    }
}