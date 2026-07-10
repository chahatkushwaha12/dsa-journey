/*
 * Problem:
 * Given two positive integers, find their Greatest Common Divisor (GCD).
 * Hint: Loop always runs for the smaller number
 */

/*
 * Brute Force Approach
 * Time Complexity: O(min(N1, N2))
 * Space Complexity: O(1)
 */
public static int findGCDBrute(int n1, int n2) {
    int gcd = 1;
    for(int i = 1; i <= Math.min(n1, n2); i++){

        // Update GCD whenever a larger common divisor is found
        if(n1 % i == 0 && n2 % i == 0){
            gcd = i;
        }
    }
    return gcd;
}

/*
 * Better Approach
 * Time Complexity: O(min(N1, N2))
 * Space Complexity: O(1)
 */
public static int findGCDBetter(int n1, int n2) {
    // Traverse in descending order to find the GCD early
    for(int i = Math.min(n1, n2); i>0; i--){

        // The first common divisor found is the GCD.
        if(n1 % i == 0 && n2 % i == 0){
            return i;
        }
    }
    return i;
}

/*
 * Optimal Approach (Euclidean Algorithm)
 * Euclidean Algorithm:
 * The Euclidean Algorithm is a method for finding the greatest common divisor (GCD)
 * of two numbers. It operates on the principle that the GCD of two numbers remains
 * the same even if the smaller number is subtracted from the larger number.
 *
 * To find the GCD of n1 and n2 where n1 > n2:
 * 1. Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
 * 2. Once one becomes 0, the other is the GCD of the original numbers.
 *
 * Hint: gcd(n1, n2) = gcd(n1-n2, n2)
 * Time Complexity: O(log(min(N1, N2)))
 * Space Complexity: O(1)
 */
public static int findGCDOptimal(int n1, int n2) {

    // Continue until one of the numbers becomes zero.
    while(n1 > 0 && n2 > 0){

        // Replace the larger number with its remainder.
        if(n1 > n2){
            n1 = n1 % n2;
        }else{
            n2 = n2 % n1;
        }
    }
    // The remaining non-zero value is the GCD.
    if(n1 == 0){
        return n2;
    }
    return n1;
}