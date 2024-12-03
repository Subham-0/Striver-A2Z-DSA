package Array.FindTheNumberThatAppearsOnceAndTheOtherNumberTwice.OptimalApproach;

import java.util.Scanner;

public class Solution {
    public static int getSingleElement(int[] arr , int n){
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
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
