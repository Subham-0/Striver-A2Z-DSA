package Array.FindMissingNumber.OptimalApproach2;

import java.util.Scanner;

public class Solution {
    public static int missingNumber(int arr[], int N){
        int xor1 = 0 , xor2 = 0;
        for(int i = 0 ; i< N-1 ;i++){
            xor2 = xor2 ^ arr[i]; //XOR of array element
            xor1 = xor1 ^ (i+1);  //XOR of 1 to N-1
        }
        xor1 = xor1^N; //XOR upto N
        return xor1 ^ xor2;
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
