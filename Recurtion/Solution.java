package Recurtion;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    // print Name n times using recursion
    public static void printName(int n) {
        if (n < 1) {
            return;
        }
        System.out.println("Subham");
        printName(n - 1);
    }

    public static void printNameBacktrack(int n) {
        if (n < 1) {
            return;
        }
        printNameBacktrack(n - 1);
        System.out.println("Subham"); // this line wait utill the base codition is not true
    }

    public static void print_1_to_N(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        print_1_to_N(i + 1, n);
    }

    public static void print_1_to_N_Backtrack(int i, int n) {
        if (i < 1) {
            return;
        }
        print_1_to_N_Backtrack(i - 1, n);
        System.out.println(i);
    }

    public static void print_N_to_1(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.println(i);
        print_N_to_1(i - 1, n);
    }

    public static void print_N_to_1_Backtrack(int i, int n) {
        if (i > n) {
            return;
        }
        print_N_to_1_Backtrack(i + 1, n);
        System.out.println(i);
    }

    public static void sum_Of_First_N_Number1(int sum, int n) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sum_Of_First_N_Number1(sum + n, n - 1);

    }

    public static int sum_Of_First_N_Number2(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sum_Of_First_N_Number2(n - 1);
    }

    public static int sum_Of_First_N_Number3(int n) {
        return n * ((n + 1) / 2);
    }

    public static int factorial_Of_number(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial_Of_number(n - 1);
    }

    public static void printArray(int ans[], int n) {
        System.out.print("Reversed array is :- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");

        }
    }

    public static void reverseArray1(int arr[], int n) {
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[n - i - 1] = arr[i];
        }
        printArray(ans, n);
    }

    public static void reverseArray2(int arr[], int n) {
        int p1 = 0;
        int p2 = n - 1;
        while (p1 > p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }

    public static void reverseArray3(int arr[], int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray3(arr, start + 1, end - 1);
        }
    }

    public static void printArray4(Integer arr[], int n) {
        System.out.print("Reversed array is :- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray4(Integer arr[]) {
        Collections.reverse(Arrays.asList(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printName(n);
        // printNameBacktrack(n);
        // print_1_to_N(1 , n);
        // print_1_to_N_Backtrack(n , n);
        // print_N_to_1(n , n);
        // print_N_to_1_Backtrack(1 , n);
        // sum_Of_First_N_Number1(0,n); // parameterized way
        // System.out.println(sum_Of_First_N_Number2(n)); // functional way
        // System.out.println(sum_Of_First_N_Number3(n)); // by formula
        // System.out.println(factorial_Of_number(n)); // functional way

        // int arr[] = { 5, 4, 3, 2, 1 };
        // reverseArray1(arr, n); // using an extra array

        // reverseArray2(arr, n); // space optimized iterative method
        // printArray(arr, n);

        // reverseArray3(arr, 0, n - 1); // using recursive method
        // printArray(arr, n);

        Integer arr2[] = { 5, 4, 3, 2, 1 };
        reverseArray4(arr2); // using library function
        printArray4(arr2, n);
        sc.close();
    }

}
