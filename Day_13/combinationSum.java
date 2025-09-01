package DSA_Sheet.Day_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class combinationSum {
     static HashSet<List<Integer>> hs=new HashSet<>();

     public static List<List<Integer>> combination_Sum(int[] candidates, int target) {
          ArrayList<Integer> arr=new ArrayList<>();
          for(int x:candidates){arr.add(x);}

          List<List<Integer>> res=new ArrayList<>();

          combination(arr,new ArrayList<>(),res,target,0);

          return res;
     }

     public static void combination(List<Integer> arr,List<Integer> comb,List<List<Integer>> res,int target,int sum){
          if(sum==target){
               ArrayList<Integer> sortedArray=new ArrayList<>(comb);
               Collections.sort(sortedArray);

               if(!hs.contains(sortedArray)){
                    hs.add(sortedArray);
                    res.add(sortedArray);
               }
               return;
          }
          if(sum>target){
               return;
          }

          for(int i=0;i<arr.size();i++){
               int curr=arr.get(i);

               sum+=curr;
               ArrayList<Integer> newComb=new ArrayList<>(comb);
               newComb.add(curr);

               combination(arr,newComb,res,target,sum);
               sum-=curr;
          }
     }
     public static void main(String[] args) {
          int candidates[]={2,3,6,7};
          int target=7;
          System.out.println(combination_Sum(candidates, target));
     }
}
