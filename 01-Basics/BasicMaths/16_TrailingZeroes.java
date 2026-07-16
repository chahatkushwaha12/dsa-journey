/*
 * Problem:
 * Given an integer n, return the number of trailing zeroes in n!.
 * Trailing zeroes are the consecutive zeroes at the end of a number.
 *
 * Example:
 * Input: n = 10
 * 10! = 3628800
 * Output: 2
 *
 * Approach:
 * A trailing zero is formed by a pair of (2 × 5 = 10).
 * Since factors of 2 are always more than factors of 5 in n!,
 * count the total number of factors of 5.
 * Include extra factors from numbers like 25, 125, 625, ...
 *
 * Time Complexity: O(log₅ n)
 * Space Complexity: O(1)
 */
public static int getTrailingZeroes(int n) {
    int count = 0;

    // Count all factors of 5 present in n!
    while (n > 0) {
        n /= 5; // Count multiples of 5, 25, 125, ...
        count += n; // Add the number of factors of 5
    }
    return count;
}