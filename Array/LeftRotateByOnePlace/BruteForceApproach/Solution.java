package Array.LeftRotateByOnePlace.BruteForceApproach;

import java.util.Scanner;

public class Solution {
    static void solve(int arr[], int n) {
        int temp[] = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n-1] = arr[0];
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        solve(arr, s);

        sc.close();
    }
}
