package Sorting.Insertion_Sort;

import java.util.Scanner;

public class Main {
    static void insertionsort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }

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
        insertionsort(arr, n);
        sc.close();
    }
}
