/*
 * Problem:
 * Given an array, reverse its elements.
 *
 * Example:
 * Input:  [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 */

/*
 * Brute Force Approach
 *
 * Create a new array and copy elements from the original array
 * in reverse order.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

public static int[] reverseArray(int[] arr) {
    int n = arr.length;

    // Create a new array to store the reversed elements
    int[] nums = new int[n];

    /* Copy elements from the end of the original array
     to the beginning of the new array*/
    for(int i=0;i<n;i++){
        nums[i] = arr[n-1-i];
    }

    // Return the reversed array
    return nums;
}

/*
 * Better Approach (Two Pointers)
 *
 * Swap the first and last elements, then move both pointers
 * towards the center until they meet.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public static void reverseArrayBetter(int[] arr) {

    // Initialize two pointers
    int left = 0;
    int right = arr.length-1;

    // Swap elements until both pointers meet
    while(left<right){

        // Swap the current elements
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Move both pointers towards the center
        left++;
        right--;
    }
}