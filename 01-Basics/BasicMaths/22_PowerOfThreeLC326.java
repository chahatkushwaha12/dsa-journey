/*
 * Problem:
 * Given an integer `n`, return true if it is a power of three.
 * Otherwise, return false.
 *
 * A number is a power of three if there exists an integer `x`
 * such that n == 3^x.
 *
 * Example:
 * Input: n = 27
 * Output: true
 *
 * Time Complexity: O(log₃ n)
 * Space Complexity: O(1)
 */

public boolean isPowerOfThree(int n){
    // Power of 3 cannot be zero or negative
    if(n <= 0){
        return false;
    }

    // Keep dividing the number by 3 while it is divisible
    while(n % 3 == 0){
        n /= 3;
    }

    // If only 1 remains, the number is a power of three
    return n == 1;
}