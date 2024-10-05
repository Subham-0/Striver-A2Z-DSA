package Array.SecondSmallestAndSecondLargest.BruteForceApproach;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        for (int value : arr) {
            System.out.println(value);
        }

        int small = arr[1];
        int large = arr[n - 2];

        System.out.println("Second smallest = " + small);
        System.out.println("Second largest = " + large);

    }
}
