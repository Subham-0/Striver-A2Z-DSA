package Array.FindTheNumberThatAppearsOnceAndTheOtherNumberTwice.BruteForceApproach;

import java.util.Scanner;

public class Solution {
    public static int getSingleElement(int arr[],int n){
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;
            for (int j = 0; j < n; j++) {
               if(arr[j]==num){
                cnt++;
               } 
            }
            if (cnt == 1) {
                return num;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int num = getSingleElement(arr,size);
        System.out.println(num);
        sc.close();   
    }
}
