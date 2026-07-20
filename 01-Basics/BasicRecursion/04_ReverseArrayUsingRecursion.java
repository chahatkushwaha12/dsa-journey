/*
 * Problem:
 * Given an array, reverse its elements using recursion.
 *
 * Example:
 * Input:  [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 */

/*
 * Recursive Approach
 *
 * Swap the first and last elements, then recursively
 * move both pointers towards the center of the array.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)   // Recursive call stack
 */

public static void reverseArray(int[] arr, int left, int right){
    // Base Case: stop when both pointers meet or cross
    if(left >= right){
        return;
    }

    // Swap the elements
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    // Recursively reverse the remaining subarray
    reverseArray(arr, left+1, right-1);
}