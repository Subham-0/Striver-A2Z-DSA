package Array.UnionofTwoSortedArrays;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution1 {
   static ArrayList<Integer> FindUnion(int arr1[],int arr2[],int n,int m){
    HashMap<Integer,Integer> map = new HashMap<>();
    ArrayList<Integer> sum = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      map.put(arr1[i],map.getOrDefault(arr1[i], 0) +1) ; 
    }
    for (int i = 0; i < m; i++) {
        map.put(arr2[i],map.getOrDefault(arr2[i], 0) +1) ; 
      }

    for (int it: map.keySet())
      sum.add(it);
    return sum;
   } 
 public static void main(String[] args) {
    int n = 10, m = 7;
  int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  int arr2[] = {2, 3, 4, 4, 5, 11, 12};
  ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
  System.out.println("Union of arr1 and arr2 is ");
  for (int val: Union)
    System.out.print(val+" ");
 }
}   

