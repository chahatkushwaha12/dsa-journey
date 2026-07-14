/*
 * Problem:
 * Given a positive integer, find the product of its digits.
 *
 * The product of digits is obtained by multiplying all individual digits
 * of the given number.
 *
 * Time Complexity: O(log₁₀(N))
 * Space Complexity: O(1)
 * Hint: Extract each digit using modulo 10 and multiply it with the product
 */
public static int productOfDigits(int n) {
    int prod = 1;
    while(n != 0){
        int lastDigit = n % 10;

        // Multiply the extracted digit with the product
        prod = prod * lastDigit;
        n /= 10;
    }
    return prod;
}