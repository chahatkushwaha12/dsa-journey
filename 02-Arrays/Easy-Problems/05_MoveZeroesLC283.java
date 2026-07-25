/*
 * Problem:
 * Given an integer array nums, move all 0's to the end of the array
 * while maintaining the relative order of the non-zero elements.
 *
 * You must perform this operation in-place without making a copy
 * of the array.
 *
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */

/*
 * Brute Force Approach
 *
 * Store all non-zero elements in a temporary array.
 * Copy the non-zero elements back to the original array,
 * then fill the remaining positions with 0.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public void moveZeroesBrute(int[] nums) {
    int n = nums.length;
    int[] temp = new int[n];
    int index = 0;

    // Store all the non-zero element in the temp array
    for(int i=0;i<n;i++){
        if(nums[i]!=0){
            temp[index++] = nums[i];
        }
    }

    // Fill the remaining position with 0
    while(index<n){
        temp[index++] = 0;
    }

    // Copy the result back to the original array
    for(int i=0;i<n;i++){
        nums[i] = temp[i];
    }
}

/*
 * Better Approach
 *
 * Traverse the array and whenever a non-zero element is found,
 * place it at the next available position from the beginning.
 * After processing all non-zero elements, fill the remaining
 * positions with 0.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public void moveZeroesBetter(int[] nums) {
    int n = nums.length;
    int index = 0;

    // Place all non-zero elements at the beginning
    for(int i=0;i<n;i++){
        if(nums[i] != 0) {
            nums[index++] = nums[i];
        }
    }
    // Fill the remaining positions with 0
    while(index<n){
        nums[index++] = 0;
    }

}

/*
 * Optimal Approach (Two Pointers)
 *
 * Find the index of the first 0. Traverse the remaining array
 * using another pointer. Whenever a non-zero element is found,
 * swap it with the first zero and move the zero pointer forward.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public void moveZeroesOpt(int[] nums) {
    int n = nums.length;
    int j = -1;

    // Find the index of the first 0
    for(int i=0;i<n;i++){
        if(nums[i] == 0){
            j = i;
            break;
        }
    }

    // If there is no 0 in the array, return
    if(j==-1){
        return;
    }

    // Swap non-zero elements with the first 0
    for(int i=j+1;i<n;i++){
        if(nums[i] != 0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
    }

}