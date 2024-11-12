package Array.FindMissingNumber.OptimalApproach1;

import java.util.Scanner;

public class Solution {
    public static int missingNumber(int arr[],int n){
        int s1 = (n*(n+1))/2;
        int s2 = 0;
        for (int i = 0; i < n-1; i++) {
            s2 += arr[i];
        }
        int num = s1-s2;
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size-1; i++) {
            arr[i] = sc.nextInt();
        }
        int num = missingNumber(arr,size);
        System.out.println(num);
        sc.close();
    }
}
