package Array.CheckDuplicates.BruteForceApproach;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    static int removeDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x : set) {
            arr[j++] = x;
            System.out.print(x + " ");
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int res = removeDuplicates(arr);
        System.out.println("");
        System.out.println(res);
        sc.close();
    }
}
