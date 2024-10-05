package Array.CheckDuplicates.OptimalApproach;

import java.util.Scanner;

public class Solution {
    static int removeDuplicates(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
                System.out.print(arr[i]);
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        int res = removeDuplicates(arr);
        System.out.println("");
        System.out.println(res);
        sc.close();
    }
}
