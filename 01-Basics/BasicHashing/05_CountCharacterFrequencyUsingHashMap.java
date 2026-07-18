/*
Problem: Count Character Frequency Using HashMap

Problem Statement:
Given a string, preprocess it using a HashMap to store the frequency of each character.
Then answer multiple queries. For each queried character, print its frequency in the string.
If the character does not exist, print 0.

Example:
Input:
String = "abacaba"
Queries = ['a', 'b', 'c', 'd']

Output:
a -> 4
b -> 2
c -> 1
d -> 0

Approach:
1. Traverse the string once and store the frequency of each character in a HashMap.
2. For every query:
   - If the character exists in the HashMap, print its frequency.
   - Otherwise, print 0.

Time Complexity:
- Pre-computation: O(N)
- Each Query: O(1) (average case)
- Total: O(N + Q)

Space Complexity:
- O(K), where K is the number of distinct characters.
*/
public static void countCharacterFrequency(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string:");
    String str = sc.nextLine();

    /* -------------------- Pre-Computation --------------------
     Store the frequency of each character in a HashMap*/
    HashMap<Character, Integer> map = new HashMap<>();

    for(int i=0;i<str.length(); i++){
        char key = str.charAt(i);
        int freq = 0;

        // If the character is already present, get its current frequency
        if(map.containsKey(key)){
            freq = map.get(key);
        }

        // Increment the frequency of the current character
        freq++;

        // Update the HashMap with the new frequency
        map.put(key, freq);
    }

    /* -------------------- Queries --------------------
     Number of characters whose frequencies need to be found*/
    System.out.print("Enter the number of queries: ");
    int q = sc.nextInt();

    while(q -- != 0){
        // Read the query character
        char ch = sc.next().charAt(0);

        // Fetch and print its frequency
        if(map.containsKey(ch)){
            System.out.println(map.get(ch));
        }else{
            // Character not found in the string
            System.out.println(0);
        }
    }
    sc.close();
}