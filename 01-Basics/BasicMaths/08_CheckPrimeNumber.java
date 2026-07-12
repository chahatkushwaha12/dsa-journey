/*
 * Problem:
 * Check whether a given number is a Prime Number.
 *
 * A Prime Number is a number greater than 1 that has exactly
 * two divisors: 1 and the number itself.
 *
 * Time Complexity: Depends on the approach
 * Space Complexity: O(1)
 */

/*
 * Brute Force Approach
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public static boolean isPrimeBrute(int n){
    int count = 0;

    // Count all divisors from 1 to n
    for(int i = 1;i <= n; i++){
        if(n % i == 0){
            count++;
        }
    }

    // A prime number has exactly two divisors
    return count == 2;
}

/*
 * Optimal Approach
 * Time Complexity: O(sqrt(n))
 * Space Complexity: O(1)
 */
public static boolean isPrimeOptimal(int n){
    int count = 0;

    // Check divisors only up to the square root of n
    for(int i = 1; i * i <= n; i++){
        if(n % i == 0){
            count++;

            // Count the paired divisor if it is different
            if(n / i != i){
                count++;
            }
        }
    }
    return count == 2;
}