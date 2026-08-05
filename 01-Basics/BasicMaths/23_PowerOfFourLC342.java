/*
 * Problem:
 * Given an integer `n`, return true if it is a power of four.
 * Otherwise, return false.
 *
 * A number is a power of four if there exists an integer `x`
 * such that n == 4^x.
 *
 * Example:
 * Input: n = 16
 * Output: true
 *
 * Time Complexity: O(log₄ n)
 * Space Complexity: O(1)
 */
public boolean isPowerOfFour(int n){
    // Power of 4 cannot be zero or negative
    if(n <= 0){
        return false;
    }

    // Keep dividing the number by 4 while it is divisible
    while(n % 4 == 0){
        n /= 4;
    }

    // If only 1 remains, the number is a power of four
    return n == 1;
}