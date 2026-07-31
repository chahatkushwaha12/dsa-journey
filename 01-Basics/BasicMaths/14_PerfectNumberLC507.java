/*
 * Problem:
 * Given a positive integer, check whether it is a Perfect Number.
 *
 * A Perfect Number is a number whose sum of proper divisors
 * (excluding the number itself) is equal to the number.
 */

/*
 * Brute Force Approach
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * Hint: Check all numbers from 1 to N - 1 and add the divisors
 */
public static boolean isPerfectNumberBrute(int num) {
    if(num == 1){
        return false;
    }
    int sum = 0;
    for(int i=1; i<num; i++){
        if(num % i == 0){
            sum += i;
        }
    }
    return sum == num;
}

/*
 * Optimal Approach
 * Time Complexity: O(√N)
 * Space Complexity: O(1)
 * Hint: Check divisors up to √N and add both divisors of each pair
 */
public static boolean isPerfectNumberOptimal(int num) {
    if(num == 1){
        return false;
    }

    // 1 is always a proper divisor (except for 1 itself)
    int sum = 1;

    for(int i=2; i*i<=num; i++){
        if(num % i == 0){
            sum += i;

            // Add the paired divisor if it is different
            if(i != num/i){
                sum += num/i;
            }
        }
    }
    return num == sum;
}