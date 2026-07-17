/*
 * Problem:
 * Given an uppercase string and multiple character queries,
 * print the frequency of each queried character.
 *
 * Example:
 * Input:
 * Enter the string: ABACABA
 * Enter the number of queries: 4
 * A
 * B
 * C
 * D
 *
 * Output:
 * 4
 * 2
 * 1
 * 0
 *
 * Explanation:
 * Build a hash array to store the frequency of each uppercase character.
 * Each query is answered by directly accessing its corresponding index.
 *
 * Time Complexity: O(N + Q)
 * Space Complexity: O(26)
 */
public static void uppercaseCharacterHashing() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the string: ");
    String str = sc.nextLine();

    // Hash array to store the frequency of uppercase characters ('A' to 'Z')
    int[] hash = new int[26];

    // Pre-Computation: Count the frequency of each character
    for (int i = 0; i < str.length(); i++) {
        hash[str.charAt(i) - 'A']++;
    }

    System.out.print("Enter the number of queries: ");
    int q = sc.nextInt();

    while (q-- > 0) {

        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        // Fetch and print the frequency of the queried character
        System.out.println(hash[ch - 'A']);
    }
}