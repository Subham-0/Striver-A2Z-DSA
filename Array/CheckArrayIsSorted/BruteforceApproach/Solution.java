package Array.CheckArrayIsSorted.BruteforceApproach;

import java.util.Scanner;

public class Solution {

    public static boolean checkSorted(int size, int arr[]) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
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