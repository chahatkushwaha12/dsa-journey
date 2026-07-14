/*
 * Problem:
 * Given a positive integer, find the sum of its digits.
 *
 * The sum of digits is obtained by adding all individual digits
 * of the given number.
 *
 * Time Complexity: O(log₁₀(N))
 * Space Complexity: O(1)
 * Hint: Extract each digit using modulo 10 and add it to the sum
 */
public static int sumOfDigits(int n) {
    int sum = 0;
    while(n != 0){
        int lastDigit = n % 10;

        // Add the extracted digit to the sum
        sum = sum + lastDigit;
        n /= 10;
    }
    return sum;
}