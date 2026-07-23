/*
 * Problem:
 * Given an array of integers, find the largest element.
 *
 * Example:
 * Input:  [2, 5, 1, 3, 0]
 * Output: 5
 */

/*
 * Brute Force Approach
 *
 * Sort the array and return the last element.
 *
 * Time Complexity: O(N log N)
 * Space Complexity: O(1)
 */
public static int largestElementBrute(int[] arr){
    Arrays.sort(arr); // Sort the array in ascending order.
    return arr[arr.length-1]; // Return the last element (largest).
}

/*
 * Optimal Approach
 *
 * Traverse the array once while maintaining
 * the maximum element found so far.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public static int largestElementOpt(int[] arr){
    int n = arr.length;
    int max = arr[0]; // Assume the first element is the largest.

    // Compare every element with the current maximum.
    for(int i=0; i<n; i++){
        if(arr[i]>max){
            max = arr[i];
        }
    }
    return max;
}