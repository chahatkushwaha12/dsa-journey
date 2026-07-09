/*
 * Problem:
 * Given an integer N, return the number obtained by reversing its digits.
 *
 * Approach:
 * Repeatedly extract the last digit using % 10,
 * append it to the reversed number,
 * and remove the last digit using / 10 until the number becomes 0.
 *
 * Time Complexity: O(log10 N)
 * Space Complexity: O(1)
 */
public int reverseNumber(int n){
    int revNum = 0;
    // Build the reverse number one digit at a time
    while(n != 0){
        // Get the last digit
        int lastDigit = n % 10;

        // Update the reversed number with the current digit.
        revNum = (revNum * 10) + lastDigit;

        // Remove the last digit
        n /= 10;
    }
    return revNum;
}