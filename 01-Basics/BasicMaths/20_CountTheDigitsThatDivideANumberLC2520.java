/*
 * Problem:
 * Given an integer num, return the number of digits in num
 * that divide num.
 *
 * A digit d divides num if num % d == 0.
 * Digits equal to 0 should be ignored.
 *
 * Example:
 * Input: num = 7
 * Output: 1
 * Explanation: 7 is divisible by its only digit 7.
 *
 * Input: num = 1248
 * Output: 4
 * Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
 *
 * Time Complexity: O(log₁₀ n)
 * Space Complexity: O(1)
 */
public static int countDigits(int n){
    int org = n;
    int count = 0;
    while(n != 0){
        int lastDigit = n % 10;

        // Count only if the digit is non-zero and divides the original number
        if(lastDigit != 0 && org % lastDigit == 0){
            count++;
        }
        n /= 10;
    }
    return count;
}