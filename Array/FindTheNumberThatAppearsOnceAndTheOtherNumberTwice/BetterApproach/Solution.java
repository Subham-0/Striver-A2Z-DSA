package Array.FindTheNumberThatAppearsOnceAndTheOtherNumberTwice.BetterApproach;

import java.util.Scanner;

public class Solution {
    public static int getSingleElement(int arr[],int n){
       //finding maximum element
       int maxi = arr[0];
       for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
       }
       //store the elements with their frequency
       int[] hash = new int[maxi+1];
       for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
       }
       //find the element for which frequency is one
       for (int i = 0; i < n; i++) {
            if(hash[arr[i]] == 1){
                return arr[i];
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
