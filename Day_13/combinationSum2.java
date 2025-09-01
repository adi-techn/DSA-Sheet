package DSA_Sheet.Day_13;

import java.util.*;
public class combinationSum2 {
     public static List<List<Integer>> combination_Sum2(int candidates[],int target){
          ArrayList<Integer> arr=new ArrayList<>();
          for(int x:candidates){
               arr.add(x);
          }
          Collections.sort(arr);

          List<List<Integer>> res=new ArrayList<>();

          combination(arr,new ArrayList<>(),res,target,0,0);

          return res;
     }
     public static void combination(List<Integer> arr,List<Integer> comb,List<List<Integer>> res,int target,int sum,int start){
          if(sum==target){
               res.add(comb);
               return;
          }
          if(sum>target){
               return;
          }

          for(int i=start;i<arr.size();i++){
               if(i>start  && arr.get(i)==arr.get(i-1)){
                    continue;
               }
               int curr=arr.get(i);

               ArrayList<Integer> newComb=new ArrayList<>(comb);
               newComb.add(curr);

               combination(arr, newComb, res, target, sum+curr, i+1);
          }
     }
     public static void main(String[] args) {
          int arr[]={10,1,2,7,6,1,5};
          int target=8;
          System.out.println(combination_Sum2(arr, target));
     }
}
