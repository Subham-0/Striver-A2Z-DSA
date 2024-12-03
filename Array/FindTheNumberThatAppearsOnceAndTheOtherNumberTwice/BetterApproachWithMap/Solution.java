package Array.FindTheNumberThatAppearsOnceAndTheOtherNumberTwice.BetterApproachWithMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
  public static int getSingleElement(int arr[],int n){
       HashMap<Integer,Integer> map = new HashMap<>();
       //store the elements with their frequency
      for (int i = 0; i < n; i++) {
        int value = map.getOrDefault(arr[i], 0);
        map.put(arr[i],value+1);
      }
       //find the element for which frequency is one
       for(Map.Entry<Integer,Integer> it : map.entrySet()){
        if(it.getValue() == 1){
            return it.getKey();
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
