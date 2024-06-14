package Basic_Hashing.Using_Array.Character_hashing;

import java.util.Scanner;

public class Solution_allCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        // precomputing
        int arr[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int q;
        q = sc.nextInt();
        // fetching
        while (q-- >= 0) {
            char c = sc.next().charAt(0);
            System.out.println(arr[c]);
        }

        sc.close();
    }
}
