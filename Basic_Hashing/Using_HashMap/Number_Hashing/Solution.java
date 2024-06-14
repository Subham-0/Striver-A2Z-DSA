package Basic_Hashing.Using_HashMap.Number_Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // precomputing
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
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
        while (q >= 0) {
            int num;
            num = sc.nextInt();
            // fetch
            if (mp.containsKey(num)) {
                System.out.println(mp.get(num));
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
