package Sorting.Selection_Sort;

import java.util.Scanner;

public class Main {

    public static void selection_sort(int arr[], int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selection_sort(arr, n); //select the minimum and swap at the end

        sc.close();

    }
}
