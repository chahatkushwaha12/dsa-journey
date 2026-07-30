/*
 * Problem:
 * Given an integer array `arr` and a target element `num`,
 * return the index of the first occurrence of the target.
 *
 * If the target is not present in the array,
 * return -1.
 *
 * Example:
 * Input: arr = [2,4,2,3,6,23,3,2], num = 23
 * Output: 5
 */

/*
 * Brute Force Approach
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

 // Returns the index of the target element if found, otherwise -1
public static int linearSearch(int[] arr, int num) {

    // Traverse the array
    for (int i = 0; i < arr.length; i++) {

        // Check if current element matches the target
        if (arr[i] == num) {
            return i;
        }
    }

    // Target element not found
    return -1;
}