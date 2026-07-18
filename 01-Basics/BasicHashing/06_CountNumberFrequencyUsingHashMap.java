/*
Problem: Count Number Frequency Using HashMap

Problem Statement:
Given an array of integers, preprocess it using a HashMap to store the frequency
of each number. Then answer multiple queries. For each queried number, print its
frequency in the array. If the number is not present, print 0.

Example:
Input:
Array = [1, 2, 1, 3, 2, 1, 5]
Queries = [1, 2, 5, 4]

Output:
1 -> 3
2 -> 2
5 -> 1
4 -> 0

Approach:
1. Traverse the array once and store the frequency of each number in a HashMap.
2. For every query:
   - If the number exists in the HashMap, print its frequency.
   - Otherwise, print 0.

Time Complexity:
- Pre-computation: O(N)
- Each Query: O(1) (average case)
- Total: O(N + Q)

Space Complexity:
- O(K), where K is the number of distinct elements in the array.
*/
public static void countNumberFrequency(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    int n = sc.nextInt();

    // Input array elements
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    // -------------------- Pre-Computation --------------------
    // Store the frequency of each number in a HashMap
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
        int key = arr[i];
        int freq = 0;

        // If the number is already present, get its current frequency
        if(map.containsKey(key)){
            freq = map.get(key);
        }

        // Increment the frequency of the current number
        freq++;

        // Update the HashMap with the new frequency
        map.put(key, freq);
    }

    // -------------------- Queries --------------------
    // Number of queries
    System.out.print("Enter the number of queries:");
    int q = sc.nextInt();

    while(q-- != 0){
        // Read the query number
        int num  = sc.nextInt();;
        // Fetch and print its frequency
        if(map.containsKey(num)){
            System.out.println(map.get(num));
        }else{
            // Number not present in the array
            System.out.println(0);
        }
    }
}