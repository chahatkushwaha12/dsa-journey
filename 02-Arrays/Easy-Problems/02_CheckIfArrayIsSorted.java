/*
 * Problem:
 * Given an array of integers, check whether the array is sorted
 * in non-decreasing order. Return true if it is sorted,
 * otherwise return false.
 *
 * Example:
 * Input:  [1, 2, 2, 4, 5]
 * Output: true
 *
 * Input:  [1, 3, 2, 4]
 * Output: false
 */

/*
 * Brute Force Approach
 *
 * Compare every element with all elements that come after it.
 * If any element is greater than a later element,
 * the array is not sorted.
 *
 * Time Complexity: O(N²)
 * Space Complexity: O(1)
 */
public static boolean isSortedBrute(int[] arr){
    int n = arr.length;

    // Compare every element with all elements after it
    for(int i = 0; i < n - 1; i++){
        for(int j = i + 1; j < n; j++){

            // If a smaller element is found later,
            // the array is not sorted
            if(arr[i] > arr[j]){
                return false;
            }
        }
    }

    // No violation found, so the array is sorted
    return true;
}

/*
 * Optimal Approach
 *
 * Traverse the array once and compare each element
 * with its previous element. If any previous element
 * is greater than the current element, the array is
 * not sorted. Otherwise, it is sorted.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public static boolean isSortedOpt(int[] arr){
    int n = arr.length;

    // Traverse the array once
    for(int i = 1; i < n; i++){

        // If the previous element is greater than
        // the current element, the array is not sorted
        if(arr[i - 1] > arr[i]){
            return false;
        }
    }

    // All adjacent elements are in correct order
    return true;
}