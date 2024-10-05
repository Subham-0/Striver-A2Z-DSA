package Array.LargestElement.BruteForceApproach;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 0 };
        System.out.println("The largest element in the array is " + sort(arr));

    }

    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
