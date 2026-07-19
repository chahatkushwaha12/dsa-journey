/*
 * Problem:
 * Print numbers from 0 to 7 using recursion.
 *
 * Example:
 * Output:
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 */

/*
 * Approach:
 * 1. Initialize a counter variable with value 0.
 * 2. Print the current value of the counter.
 * 3. Increment the counter.
 * 4. Recursively call the same function.
 * 5. Stop the recursion when the counter reaches 8 (base case).
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public static void printData(int count){
    if(count == 8){
        return;
    }
    System.out.println(count); // <-- Pehle print hota hai
    printData(count+1); // <-- Uske baad next call hoti hai
}