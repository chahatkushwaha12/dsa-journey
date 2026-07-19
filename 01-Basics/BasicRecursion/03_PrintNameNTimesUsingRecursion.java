/*
 * Problem:
 * Print a given name N times using recursion.
 *
 * Example:
 * Input:
 * N = 5
 *
 * Output:
 * Chahat
 * Chahat
 * Chahat
 * Chahat
 * Chahat
 */

/*
 * Approach:
 * 1. Start the recursive function with `i = 1`.
 * 2. Print the given name.
 * 3. Recursively call the function with `i + 1`.
 * 4. Stop the recursion when `i > N` (base case).
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public static void printName(int i, int n){

    // Base case: stop recursion once i becomes greater than N.
    if(i>n){
        return;
    }
    System.out.println("Chahat"); // Print the given name.
    printName(i+1, n); // Recursively call the function for the next iteration.
}