package Array.CheckArrayIsSorted.OptimalApproach;

import java.util.Scanner;

public class Solution {

    public static boolean checkSorted(int size, int arr[]) {
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = checkSorted(s, arr);
        System.out.println(res);
        sc.close();
    }
}
