/*
 * Problem:
 * Given a string, determine whether it is a palindrome.
 *
 * A palindrome reads the same forward and backward.
 * Ignore case and all non-alphanumeric characters.
 *
 * Example 1:
 * Input: "madam"
 * Output: true
 *
 * Example 2:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 */

/*
 * Brute Force
 *
 * Time Complexity: O(N²)
 * Space Complexity: O(N)
 */
public static boolean isPalindromeBrute(String s){
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
    String rev = "";
    for(int i=s.length()-1;i>=0;i--){
        rev += s.charAt(i);
    }
    return s.equals(rev);
}

/*
 * Optimal
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public static boolean isPalindromeOpt(String s){
    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

    // By two pointer approach
    int left = 0;
    int right = s.length()-1;
    while(left<right){
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}