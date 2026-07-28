/*
 * Problem:
 * Given a string `s` consisting of words and spaces,
 * return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of
 * non-space characters only.
 *
 * Example:
 * Input:  "Hello World"
 * Output: 5
 *
 * Explanation:
 * The last word is "World", which has 5 characters.
 */
public static int lengthOfLastWord(String s){
    // Start from the last character of the string
    int i = s.length()-1;

    // Skip all trailing spaces (if any)
    while(i>=0 && s.charAt(i) == ' '){
        i--;
    }

    // Stores the length of the last word
    int length = 0;

    // Count characters until a space or beginning of the string is reached
    while(i>=0 && s.charAt(i) != ' '){
        length++;
        i--;
    }

    return length;
}