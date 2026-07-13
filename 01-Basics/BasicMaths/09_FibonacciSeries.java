/*
 * Problem:
 * Print the Fibonacci Series up to N terms.
 *
 * Fibonacci Series:
 * A sequence where each number is the sum of the previous two numbers.
 * The series starts with 0 and 1.
 *
 * Example:
 * Input: N = 7
 * Output: 0 1 1 2 3 5 8
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public static void fibonacciSeries(int n){
    // Handle invalid input
    if(n <= 0){
        System.out.println("Please enter a positive number");
        return;
    }

    // Initialize the first two Fibonacci numbers
    int first = 0;
    int second = 1;
    System.out.println("The Fibonacci series up to "+n+" th term");

    // Print the first Fibonacci number
    System.out.print(first+" ");

    // Print the second number only if more than one term is required
    if(n>1){
        System.out.print(second+" ");
    }

    // Generate the remaining Fibonacci numbers
    for(int i = 2; i < n; i++){
        int temp = first+second;

        // Update the previous two numbers
        first = second;
        second = temp;
        System.out.print(temp+" ");
    }
    System.out.println();
}