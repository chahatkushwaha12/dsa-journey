/*
 * Problem:
 * Given an uppercase string, build a hash array that stores
 * the frequency of each character ('A' to 'Z').
 *
 * Example:
 * Input:
 * String = "ABACABA"
 *
 * Output:
 * hash['A' - 'A'] = 4
 * hash['B' - 'A'] = 2
 * hash['C' - 'A'] = 1
 * hash['D' - 'A'] = 0
 *
 * Explanation:
 * Each index of the hash array represents an uppercase character.
 * The frequency of a character is stored at its corresponding index.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(26)
 */
public static int[] characterFrequency(String str) {

    // Hash array to store the frequency of uppercase characters ('A' to 'Z')
    int[] hash = new int[26];

    // Pre-Computation: Count the frequency of each character
    for (int i = 0; i < str.length(); i++) {
        hash[str.charAt(i) - 'A']++;
    }

    return hash;
}