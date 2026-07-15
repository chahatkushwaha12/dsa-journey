/*
 * Problem:
 * Given a positive integer, check whether it is a Strong Number.
 *
 * A Strong Number is a number whose sum of factorials of its digits
 * is equal to the original number.
 *
 * Example:
 * 145 → 1! + 4! + 5! = 145
 * 1! = 1
 * 4! = 24
 * 5! = 120
 */

/*
 * Approach
 * Time Complexity: O(D × K)
 * Space Complexity: O(1)
 * Hint: Extract each digit, calculate its factorial, and add it to the sum
 */
public static boolean isStrongNumber(int n) {
    int sum = 0;
    int org = n;
    while(n != 0){
        int lastDigit = n % 10;

        // Add the factorial of the current digit to the sum
        sum = sum + fact(lastDigit);
        n /= 10;
    }
    return sum == org;
}
public static int fact(int n){
    int fact = 1;
    for(int i = 1; i <= n; i++){
        fact = fact * i;
    }
    return fact;
}