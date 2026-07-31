/*
 * Problem:
 * Given an integer array `arr`,
 * return the smallest element present in the array.
 *
 * Example 1:
 * Input: arr = [2, 5, 1, 3, 0]
 * Output: 0
 *
 * Example 2:
 * Input: arr = [8, 10, 5, 7, 9]
 * Output: 5
 */

/*
 * Brute Force Approach
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */
public static int smallestElementBrute(int[] arr){
    Arrays.sort(arr); // Sort the array
    return arr[0]; // First element is the smallest
}

/*
 * Optimal Approach
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public static int smallestElementOpt(int[] arr){
    int n = arr.length;

    // Assume first element is the smallest
    int smallest = arr[0];

    for(int i=0;i<n;i++){

        // Update smallest if a smaller element is found
        if(arr[i]<smallest){
            smallest = arr[i];
        }
    }
    return smallest;
}