/*
 * Problem:
 * Given a positive integer n, print all of its prime factors in ascending order.
 * If a prime factor appears multiple times, print it multiple times.
 *
 * Example:
 * Input: n = 20
 * Output: 2 2 5
 * Explanation:
 * 20 = 2 × 2 × 5
 *
 * Approach:
 * Start checking divisibility from 2.
 * While the current number divides n, print/store it and divide n by it.
 * Move to the next number and repeat until n becomes 1.
 *
 * Time Complexity: O(√n)
 * Space Complexity: O(1)   // Ignoring the output list
 */
public static void primeFactors(int n){

    // Check all possible factors up to
    for(int i = 2; i * i <= n; i++){

        // Print the factor while it divides n
        while(n % i == 0){
            System.out.print(i+" ");
            n /= i;
        }
    }

    // Print the remaining prime factor, if any
    if(n > 1){
        System.out.print(n);
    }
}