/*
 * Problem:
 * Given a number and a non-negative integer exponent, calculate the power
 * of the number.
 *
 * Power represents the result of multiplying the base by itself
 * exponent number of times.
 */

/*
 * Brute Force Approach
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * Hint: Multiply the base N times
 */
public static long findPowerBrute(int base, int exponent) {
    long ans = 1;
    for(int i = 1; i<= exponent; i++){
        ans *= base;
    }
    return ans;
}

/*
 * Optimal Approach (Binary Exponentiation)
 *
 * Binary Exponentiation:
 * It reduces the exponent by half at each step by using the properties
 * of even and odd exponents.
 *
 * Hint:
 * If exponent is even: a^n = (a * a)^(n / 2)
 * If exponent is odd:  a^n = a * a^(n - 1)
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 */
public static long findPowerOptimal(int base, int exponent) {
    long ans = 1;
    long currentBase = base;

    while (exponent > 0) {

        // Multiply the result when the exponent is odd
        if(exponent % 2 == 1){
            ans = ans * currentBase;
        }

        // Square the base and reduce the exponent by half
        currentBase *= currentBase;
        exponent /= 2;
    }
    return ans;
}
