/*
 * Problem:
 * Given two positive integers, find their Least Common Multiple (LCM).
 *
 * LCM is the smallest positive number that is completely divisible
 * by both numbers.
 */

/*
 * Brute Force Approach
 * Time Complexity: O(min(N1, N2))
 * Space Complexity: O(1)
 * Hint: Check all possible divisors to find GCD, then calculate LCM
 */
public static int findLCMBrute(int n1, int n2) {
    int gcd = 1;

    for (int i = 2; i <= Math.min(n1, n2); i++) {

        // Update GCD whenever a larger common divisor is found
        if (n1 % i == 0 && n2 % i == 0) {
            gcd = i;
        }
    }

    // Calculate LCM using the relation: LCM = (N1 * N2) / GCD
    int lcm = (n1 * n2) / gcd;
    return lcm;
}

/*
 * Better Approach
 * Time Complexity: O(min(N1, N2))
 * Space Complexity: O(1)
 * Hint: Check divisors from the smaller number downwards and stop at the first common divisor
 */
public static int findLCMBetter(int n1, int n2) {
    int gcd = 1;

    // Traverse in descending order to find the GCD early
    for (int i = Math.min(n1, n2); i >= 2; i--) {

        // The first common divisor found is the GCD
        if (n1 % i == 0 && n2 % i == 0) {
            gcd = i;
            break;
        }
    }

    // Calculate LCM using the relation: LCM = (N1 * N2) / GCD
    int lcm = (n1 * n2) / gcd;
    return lcm;
}

/*
 * Optimal Approach (Using Euclidean Algorithm)
 *
 * Euclidean Algorithm:
 * The GCD of two numbers remains the same if the larger number
 * is replaced by its remainder when divided by the smaller number.
 *
 * Hint:
 * LCM(N1, N2) = (N1 / GCD(N1, N2)) * N2
 *
 * Time Complexity: O(log(min(N1, N2)))
 * Space Complexity: O(1)
 */
public static int findLCMOptimal(int n1, int n2) {

    int orgN1 = n1;
    int orgN2 = n2;

    // Continue until one of the numbers becomes zero
    while (n1 > 0 && n2 > 0) {

        // Replace the larger number with its remainder
        if (n1 > n2) {
            n1 = n1 % n2;
        } else {
            n2 = n2 % n1;
        }
    }

    // The non-zero number is the GCD
    int gcd = 1;
    if (n1 == 0) {
        gcd = n2;
    } else {
        gcd = n1;
    }

    // Calculate LCM using the relation: LCM = (N1 * N2) / GCD
    int lcm = (orgN1 * orgN2) / gcd;
    return lcm;
}