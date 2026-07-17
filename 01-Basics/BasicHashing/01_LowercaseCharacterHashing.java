/*
 * Problem:
 * Given a lowercase string, build a hash array that stores
 * the frequency of each character ('a' to 'z').
 *
 * Example:
 * Input:
 * String = "abacaba"
 *
 * Output:
 * hash['a' - 'a'] = 4
 * hash['b' - 'a'] = 2
 * hash['c' - 'a'] = 1
 * hash['d' - 'a'] = 0
 *
 * Explanation:
 * Each index of the hash array represents a lowercase character.
 * The frequency of a character is stored at its corresponding index.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(26)
 */
public static int[] characterFrequency(String str) {

    // Hash array to store the frequency of lowercase characters ('a' to 'z')
    int[] hash = new int[26];

    // Pre-Computation: Count the frequency of each character
    for (int i = 0; i < str.length(); i++) {
        hash[str.charAt(i) - 'a']++;
    }

    return hash;
}