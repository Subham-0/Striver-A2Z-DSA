package Array.SecondSmallestAndSecondLargest.OptimalApproach;

import java.util.Scanner;

public class Solution {
    public static int secondlargest(int arr[], int n) {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static int secondsmallest(int arr[], int n) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int slargest = secondlargest(arr, n);
        System.out.println(slargest);

        int ssmallest = secondsmallest(arr, n);
        System.out.println(ssmallest);
    }
}
