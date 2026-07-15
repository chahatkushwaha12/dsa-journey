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
public static boolean isPerfectNumberBrute(int n) {
    List<Integer> list = new ArrayList<>();
    for(int i=1;i<n;i++){
        if(n % i == 0){
            list.add(i); // Add the divisor
        }
    }
    int sum = 0;
    for(int i=0;i<list.size();i++){
        sum = sum + list.get(i);
    }
    return sum == n;
}

/*
 * Optimal Approach
 * Time Complexity: O(√N)
 * Space Complexity: O(1)
 * Hint: Check divisors up to √N and add both divisors of each pair
 */
public static boolean isPerfectNumberOptimal(int n) {
    List<Integer> list = new ArrayList<>();

    // Check divisors only up to the square root of n
    for(int i = 1; i * i <= n; i++){
        if(n %i == 0){
            list.add(i); // Add the first divisor

            // Add the paired divisor if it is distinct and not the number itself
            if(n / i != i && n / i != n){
                list.add(n/i);
            }
        }
    }
    int sum = 0;
    for(int i = 0; i < list.size(); i++){
        sum = sum + list.get(i);
    }
    return sum == n;
}