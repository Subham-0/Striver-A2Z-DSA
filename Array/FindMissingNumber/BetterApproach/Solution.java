package Array.FindMissingNumber.BetterApproach;

import java.util.Scanner;

public class Solution {
    public static int missingNumber(int arr[],int n){
        int hash[] = new int[n+1];
        for(int i = 0; i<n-1;i++){
            hash[arr[i]]++;
        }
        for (int i = 1; i <= n ; i++) {
            if(hash[i]==0){
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
