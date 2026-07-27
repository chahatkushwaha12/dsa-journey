/*
 * Problem:
 * A sentence is a list of words separated by a single space
 * with no leading or trailing spaces.
 *
 * Given an array of strings `sentences`, where each string
 * represents a sentence, return the maximum number of words
 * found in a single sentence.
 *
 * Example:
 * Input: ["alice and bob love leetcode",
 *         "i think so too",
 *         "this is great thanks very much"]
 *
 * Output: 6
 *
 * Time Complexity: O(N × M)
 * Space Complexity: O(1)
 */

public static int mostWordsFound(String[] sentences) {
    // Stores the maximum number of words found
    int maxWord = 0;

    // Traverse each sentence
    for (String sentence : sentences) {

        // Every sentence contains at least one word
        int words = 1;

        // Count spaces in the current sentence
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                words++;
            }
        }

        // Update the maximum word count
        maxWord = Math.max(maxWord, words);
    }

    return maxWord;
}