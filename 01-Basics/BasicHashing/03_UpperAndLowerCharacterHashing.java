/*
 * Problem:
 * Given a string containing both uppercase and lowercase English letters,
 * build a hash array that stores the frequency of each character.
 *
 * Example:
 * Input:
 * String = "AbAcAba"
 *
 * Output:
 * hash['A'] = 2
 * hash['b'] = 2
 * hash['a'] = 2
 * hash['c'] = 1
 * hash['B'] = 0
 *
 * Explanation:
 * Each character is mapped to its ASCII value.
 * The frequency of every uppercase and lowercase character
 * is stored in the hash array using its ASCII index.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(256)
 */
public static int[] characterFrequency(String str) {

    // Hash array to store the frequency of ASCII characters
    int[] hash = new int[256];

    // Pre-Computation: Count the frequency of each character
    for (int i = 0; i < str.length(); i++) {
        hash[str.charAt(i)]++;
    }

    return hash;
}