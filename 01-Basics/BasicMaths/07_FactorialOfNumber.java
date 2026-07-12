/*

 * Problem:
 * Find the factorial of a given number.
 *
 * The factorial of a non-negative integer n is the product of all
 * positive integers from 1 to n. It is represented as n!.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public static int fact(int n){
    int fact = 1;

    // Multiply all numbers from 1 to n
    for(int i = 1; i<= n; i++){
        fact = fact * i;
    }
    return fact;
}
