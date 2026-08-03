/*
 * Problem:
 * Given an integer array, return the sum of all its elements.
 *
 * Example:
 * Input: arr = [1, 2, 3, 4, 5]
 * Output: 15
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public static int sumOfArray(int[] arr) {
    int sum = 0;

    // Traverse the array and add each element to sum
    for (int num : arr) {
        sum += num;
    }

    return sum;
}