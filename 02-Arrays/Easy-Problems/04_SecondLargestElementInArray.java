/*
 * Problem:
 * Given an array of integers, find the second largest element.
 * Return -1 if the second largest element does not exist.
 *
 * Example:
 * Input:  [2, 5, 1, 3, 0]
 * Output: 3
 *
 * Input:  [5, 5, 5]
 * Output: -1
 */

/*
 * Brute Force Approach
 *
 * Sort the array in ascending order and traverse
 * from the end to find the first element smaller
 * than the largest element.
 *
 * Time Complexity: O(N log N)
 * Space Complexity: O(1)
 */
/*
 * Brute Force Solution
 */
public static int secondLargestBrute(int[] arr) {

    // Sort the array in ascending order.
    Arrays.sort(arr);

    // Store the largest element.
    int largest = arr[arr.length - 1];

    // Traverse from the end to find the first
    // element smaller than the largest.
    for (int i = arr.length - 2; i >= 0; i--) {
        if (arr[i] != largest) {
            return arr[i];
        }
    }

    // Second largest element does not exist.
    return -1;
}

/*
 * Better Approach
 *
 * Find the largest element in the first traversal.
 * Then, find the largest element smaller than it
 * in the second traversal.
 *
 * Time Complexity: O(2N)
 * Space Complexity: O(1)
 */
/*
 * Better Solution
 */
public static int secondLargestBetter(int[] arr) {

    // Find the largest element.
    int largest = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > largest) {
            largest = arr[i];
        }
    }

    // Find the second largest element.
    int secondLargest = -1;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }

    return secondLargest;
}

/*
 * Optimal Approach
 *
 * Traverse the array once while maintaining
 * the largest and second largest elements.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
/*
 * Optimal Solution
 */
public static int secondLargestOpt(int[] arr) {

    // Assume the first element is the largest.
    int largest = arr[0];
    int secondLargest = -1;

    // Find the largest and second largest elements.
    for (int i = 1; i < arr.length; i++) {

        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        } else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }

    return secondLargest;
}