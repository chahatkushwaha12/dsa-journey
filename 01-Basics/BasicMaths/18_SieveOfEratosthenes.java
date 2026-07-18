/*
 * Problem:
 * Given a number N, find and print all prime numbers from 2 to N
 * using the Sieve of Eratosthenes algorithm.
 *
 * Example:
 * Input: N = 20
 * Output: 2 3 5 7 11 13 17 19
 */

/*
 * Brute Force Approach
 *
 * Check every number from 2 to N individually for primality
 * by testing divisibility up to √number.
 *
 * Time Complexity: O(N * √N)
 * Space Complexity: O(1)
 *
 * Hint:
 * Iterate through every number and check whether it has any divisor
 * other than 1 and itself.
 */
public static void findPrimesBrute(int n) {

    // Step 1: Traverse every number from 2 to N.
    for (int i = 2; i <= n; i++) {

        // Step 2: Assume the current number is prime.
        boolean isPrime = true;

        // Step 3: Check divisibility from 2 to √currentNumber.
        for (int j = 2; j * j <= i; j++) {

            // Step 4: If a divisor is found,
            // the current number is not prime.
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }

        // Step 5: Print the number if it is prime.
        if (isPrime) {
            System.out.print(i + " ");
        }
    }
}

/*
 * Optimal Approach (Sieve of Eratosthenes)
 *
 * The Sieve of Eratosthenes finds all prime numbers up to N by
 * assuming every number is prime initially. Starting from 2,
 * mark all multiples of each prime number as non-prime.
 * Finally, the remaining unmarked numbers are prime.
 *
 * Example:
 * N = 10
 * Initially: 2 3 4 5 6 7 8 9 10
 * Mark multiples of 2 → 4 6 8 10
 * Mark multiples of 3 → 9
 * Remaining primes → 2 3 5 7
 *
 * Hint:
 * Create a boolean array and initially mark every number as prime.
 * Start marking multiples from i * i because smaller multiples
 * have already been marked by smaller prime numbers.
 *
 * Time Complexity: O(N log log N)
 * Space Complexity: O(N)
 */
public static void findPrimesOptimal(int n) {

    // Step 1: Create a boolean array and
    // assume every number is prime initially.
    boolean[] prime = new boolean[n + 1];
    Arrays.fill(prime, true);

    // Step 2: Mark 0 and 1 as non-prime.
    if (n >= 0) prime[0] = false;
    if (n >= 1) prime[1] = false;

    // Step 3: Traverse from 2 to √N.
    for (int i = 2; i * i <= n; i++) {

        // Step 4: If the current number is prime,
        // mark all of its multiples as non-prime.
        if (prime[i]) {

            // Start from i * i because smaller multiples
            // have already been marked.
            for (int j = i * i; j <= n; j += i) {
                prime[j] = false;
            }
        }
    }

    // Step 5: Print all numbers that are still prime.
    for (int i = 2; i <= n; i++) {

        if (prime[i]) {
            System.out.print(i + " ");
        }
    }
}