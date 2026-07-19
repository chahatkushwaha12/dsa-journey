/*
 * Problem:
 * Print numbers from 1 to N using recursion.
 *
 * Example:
 * Input:
 * N = 5
 *
 * Output:
 * 1
 * 2
 * 3
 * 4
 * 5
 */

/*
 * Approach:
 * 1. Start the recursive function with `i = 1`.
 * 2. Print the current value of `i`.
 * 3. Recursively call the function with `i + 1`.
 * 4. Stop the recursion when `i > N` (base case).
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public static void printN(int i, int n) {

    // Base case: stop recursion once i becomes greater than N.
    if (i > n) {
        return;
    }

    System.out.println(i); // Print the current number.
    printN(i + 1, n); // Recursively call the function for the next number.
}