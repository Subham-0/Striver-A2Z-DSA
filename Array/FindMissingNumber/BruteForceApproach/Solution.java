package Array.FindMissingNumber.BruteForceApproach;

import java.util.Scanner;

public class Solution {
    public static int missingNumber(int arr[],int n){
        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n-1; j++) {
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                return i;
            }
        }
        return -1;
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
