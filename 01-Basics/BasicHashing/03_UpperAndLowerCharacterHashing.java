/*
 * Problem:
 * Given a string containing both uppercase and lowercase characters
 * and multiple character queries, print the frequency of each queried character.
 *
 * Example:
 * Input:
 * Enter the string: AbAcAba
 * Enter the number of queries: 5
 * A
 * a
 * b
 * c
 * B
 *
 * Output:
 * 2
 * 2
 * 2
 * 1
 * 0
 *
 * Explanation:
 * Build a hash array using ASCII values to store the frequency of
 * every character. Each query is answered by directly accessing
 * the character's ASCII index.
 *
 * Time Complexity: O(N + Q)
 * Space Complexity: O(256)
 */
public static void upperLowerCharacterHashing() {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the string: ");
    String str = sc.nextLine();

    // Hash array to store the frequency of ASCII characters
    int[] hash = new int[256];

    // Pre-Computation: Count the frequency of each character
    for (int i = 0; i < str.length(); i++) {
        hash[str.charAt(i)]++;
    }

    System.out.print("Enter the number of queries: ");
    int q = sc.nextInt();

    while (q-- > 0) {

        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        // Fetch and print the frequency of the queried character
        System.out.println(hash[ch]);
    }
}