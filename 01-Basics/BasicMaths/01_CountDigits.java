/*
 * Problem:
 * Given an integer N, return the total number of digits present in it.
 *
 * Approach:
 * Repeatedly divide the number by 10 and count each iteration until the number becomes 0.
 *
 * Time Complexity: O(log10 N)
 * Space Complexity: O(1)
 */
public int countDigits(int num) {
    // Zero has exactly one digit
    if(num == 0){
        return 1;
    }
    // Convert negative number into positive
    num = Math.abs(num);

    int count = 0;
    // Count digits by removing the last digit in each iteration
    while(num > 0){
        count++;
        num /= 10;
    }
    return count;
}