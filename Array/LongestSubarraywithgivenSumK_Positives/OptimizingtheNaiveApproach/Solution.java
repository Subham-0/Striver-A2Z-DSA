package Array.LongestSubarraywithgivenSumK_Positives.OptimizingtheNaiveApproach;

import java.util.Scanner;

public class Solution {
    public static int getLongestSubarray(int arr[] ,long S){
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            long sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j]; 
                if(sum == S){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int num = getLongestSubarray(arr,6);
        System.out.println(num);
        sc.close();   
    }     
}
