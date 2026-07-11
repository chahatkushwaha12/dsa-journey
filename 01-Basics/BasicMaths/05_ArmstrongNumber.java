/*
 * Problem:
 * Check whether a given number is an Armstrong Number.
 *
 * An Armstrong Number is a number equal to the sum of its digits,
 * each raised to the power of the total number of digits.
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public static boolean isArmstrong(int n){

    int org = n;
    int temp = n;
    int count = 0;

    // Count the total number of digits
    while(n != 0){
        count++;
        n /= 10; // Remove the last digit
    }

    int sum = 0;
    // Calculate the sum of each digit raised to the power of digit count
    while(temp != 0){
        int lastDigit = temp % 10; // Get the last digit
        sum += (int) Math.pow(lastDigit, count); // Add digit^count to sum
        temp /= 10; // Remove the last digit
    }

    // Check if the calculated sum is equal to the original number
    return org = sum;
}