/*
 * Problem:
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Approach:
 * - Negative numbers are never palindromes.
 * - Reverse the number digit by digit.
 * - Compare the reversed number with the original number.
 *
 * Time Complexity: O(log10 n)
 * Space Complexity: O(1)
 */
public boolean isPalindrome(int n){
    // Negative numbers can not be palindrome
    if(n < 0){
        return false;
    }

    int revNum = 0;
    int orgNum = n;

    while(n > 0){
        // Get the last digit
        int lastDigit = n % 10;

        // Update the reverse number with the current digit
        revNum = (revNum * 10) + lastDigit;

        // Remove the last digit
        n /= 10;
    }
    // compare
    return orgNum == revNum;
}