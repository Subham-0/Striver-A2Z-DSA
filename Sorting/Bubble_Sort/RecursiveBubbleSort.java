package Sorting.Bubble_Sort;

import java.util.Scanner;

public class RecursiveBubbleSort {
    public static void bubblesort(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) {
            int didswap = 0;
            if (n == 1) {
                return;
            }
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                didswap = 1;
            }
            if (didswap == 0) {
                return;
            }
            bubblesort(arr, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubblesort(arr, n);
        for (int item : arr) {
            System.out.print(item + " ");
        }
        sc.close();
    }
}
