package Array.LinearSearch;

import java.util.Scanner;

public class Solution {

    static int linearsearch(int arr[],int k){
        for (int j = 0; j < arr.length; j++) {
           if(arr[j]==k) {
            return j;
           }
        }
        return -1; 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking array size 
        int size = sc.nextInt();
        int arr[] = new int[size];
        //taking array element 
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int out = linearsearch(arr,9);
        System.out.println(out);
    }
}
