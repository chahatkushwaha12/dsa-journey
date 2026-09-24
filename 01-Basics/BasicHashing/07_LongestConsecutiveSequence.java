/*
 * Problem:
 * Find the length of the longest consecutive sequence in an array.
 *
 * A consecutive sequence contains numbers that follow each other
 * without any gap.
 *
 * Example:
 * Input:  [100, 4, 200, 1, 3, 2]
 * Output: 4
 * Sequence: 1, 2, 3, 4
 */

/*
 * Brute Force Approach
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
public static int longestConsecutiveBrute(int[] nums){

    int longest = 0;

    for(int i = 0; i < nums.length; i++){

        int current = nums[i];
        int count = 1;

        // Check for consecutive numbers
        while(linearSearch(nums, current + 1)){
            current++;
            count++;
        }

        longest = Math.max(longest, count);
    }

    return longest;
}

/*
 * Optimal Approach
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public static int longestConsecutiveOptimal(int[] nums){

    HashSet<Integer> set = new HashSet<>();

    // Store all elements in HashSet
    for(int num : nums){
        set.add(num);
    }

    int longest = 0;

    for(int num : set){

        // Start only if num is the beginning of a sequence
        if(!set.contains(num - 1)){

            int current = num;
            int count = 1;

            // Find consecutive numbers
            while(set.contains(current + 1)){
                current++;
                count++;
            }

            longest = Math.max(longest, count);
        }
    }

    return longest;
}