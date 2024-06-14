package Basic_Hashing.Using_Array.Character_hashing;

import java.util.Scanner;;

public class Solution_lowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // precomputing
        int hash[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // Query
        int q = sc.nextInt();
    

        // fetching
        while (q-- >= 0) {
            char c;
            c = sc.next().charAt(0);
            System.out.println(hash[c - 'a']);
        }
        sc.close();
    }
}
