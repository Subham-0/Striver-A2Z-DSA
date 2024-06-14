package Basic_Hashing.Using_HashMap.Character_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // precomputing
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            int freq = 0;
            if (mp.containsKey(key))
                freq = mp.get(key); // fetching from the map
            freq++;
            mp.put(key, freq); // inserting into the map

        }

        // Iterate over the map
        // for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
        // System.out.println(it.getKey() + "->" + it.getValue());
        // }

        int q = sc.nextInt();
        while (q-- >= 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch
            if (mp.containsKey(c)) {
                System.out.println(mp.get(c));
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
