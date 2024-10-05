package Array.LargestElement.RecursiveApproach;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int max = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max);
        }
    }
}
