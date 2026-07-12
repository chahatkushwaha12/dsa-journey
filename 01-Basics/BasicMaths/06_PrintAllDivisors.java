/*
 * Problem:
 * Print all divisors of a given number.
 *
 * A divisor is a number that divides the given number completely
 * without leaving any remainder.
 *
 * Time Complexity: Depends on the approach
 * Space Complexity: Depends on the approach
 */

/*
 * Brute Force Approach
 * Time Complexity: O(n)
 * Space Complexity: O(d)
 */
public static List<Integer> getDivisorsBrute(int n){
    List<Integer> list = new ArrayList<>();
    for(int i = 1; i <= n; i++){
        if(n % i == 0){
            list.add(i); // Add the divisor
        }
    }
    return list;
}

/*
 * Optimal Approach
 * Time Complexity: O(sqrt(n))
 * Space Complexity: O(d)
 */
public static List<Integer> getDivisorsOptimal(int n){

    List<Integer> list = new ArrayList<>();
    // Check divisors only up to the square root of n
    for(int i = 1; i * i <= n; i++){
        if(n % i == 0){
            list.add(i); // Add the first divisor

            // Add the paired divisor if it is different
            if(n / i != i){
                list.add(n/i);
            }
        }
    }
    return list;
}