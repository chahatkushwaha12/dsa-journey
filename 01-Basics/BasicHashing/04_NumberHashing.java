/*
 * Problem:
 * Given an array of integers and multiple number queries,
 * print the frequency of each queried number.
 *
 * Note:
 * Assume all array elements are in the range [0, 12].
 *
 * Example:
 * Input:
 * Enter the size of the array: 7
 * Enter the array elements:
 * 1 2 1 3 2 1 5
 * Enter the number of queries: 4
 * 1
 * 2
 * 4
 * 5
 *
 * Output:
 * 3
 * 2
 * 0
 * 1
 *
 * Explanation:
 * Store the frequency of each number in a hash array.
 * Each query is answered by directly accessing its corresponding index.
 *
 * Time Complexity: O(N + Q)
 * Space Complexity: O(13)
 */
public static void numberHashing() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter the array elements:");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    // Hash array to store the frequency of numbers (0 to 12)
    int[] hash = new int[13];

    // Pre-Computation: Count the frequency of each number
    for(int i=0;i<n;i++){
        hash[arr[i]]++;
    }

    System.out.print("Enter the number of queries: ");
    int q = sc.nextInt();

    while(q -- > 0){
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Fetch and print the frequency of the queried number
        System.out.println(hash[num]);
    }
}