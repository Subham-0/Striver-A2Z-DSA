package Array.LeftRotateByOnePlace.OptimalApproach;

import java.util.Scanner;

public class Solution {

    static void solve(int arr[], int s) {
        int temp = arr[0];
        for (int i = 0; i < s - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[s - 1] = temp;

        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
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
