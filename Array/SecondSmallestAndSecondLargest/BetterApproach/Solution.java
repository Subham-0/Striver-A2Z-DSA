package Array.SecondSmallestAndSecondLargest.BetterApproach;

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
        // largest
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // secondlargest
        int secondlargest = -1;
        for (int i = 0; i < n; i++) {
            if (secondlargest < arr[i] && arr[i] != largest) {
                secondlargest = arr[i];
            }
        }

        System.out.println(secondlargest);
    }
}
