package Array.MaximumConsecutiveOnes;

import java.util.Scanner;

public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int maxi = 0;
        for(int i = 0; i<nums.length ; i++){
            if(nums[i]==1){
                cnt++;
            }else{
                cnt = 0;
                maxi=Math.max(maxi,cnt);
            }
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size-1; i++) {
            arr[i] = sc.nextInt();
        }
        int num = findMaxConsecutiveOnes(arr);
        System.out.println(num);
        sc.close();
    }
}
