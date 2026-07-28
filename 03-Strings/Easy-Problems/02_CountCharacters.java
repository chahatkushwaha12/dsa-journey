/*
 * Problem:
 * Given a string `s`, count the total number of characters
 * excluding white spaces.
 *
 * Example:
 * Input:  "Hello World"
 * Output: 10
 *
 * Explanation:
 * The space between "Hello" and "World" is ignored.
 */

public static int countCharacters(String s) {
    int count = 0;

    // Traverse each character in the string
    for (int i = 0; i < s.length(); i++) {

        // Count only non-space characters
        if (s.charAt(i) != ' ') {
            count++;
        }
    }

    return count;
}