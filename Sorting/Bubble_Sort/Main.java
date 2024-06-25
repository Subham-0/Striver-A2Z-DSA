package Sorting.Bubble_Sort;

import java.util.Scanner;

public class Main {

    static void bubblesort(int arr[], int n) {
        int swap = 0;
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {

                break;
            }
            // System.out.println(0);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
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
        sc.close();
    }
}
