package DSA_Sheet.Day_12;

import java.util.*;

public class arrCombination {
     public static List<List<Integer>> combine(int n,int k){
          ArrayList<Integer> arr=new ArrayList<>();
          for(int i=1;i<=n;i++){
               arr.add(i);
          }

          List<List<Integer>> res=new ArrayList<>();

          combination(arr,new ArrayList<>(),res,k,0);

          return res;
     }
     public static void combination(List<Integer> arr,List<Integer> comb,List<List<Integer>> res,int k,int i){
          if(comb.size()==k){
               res.add(comb);
               return;
          }

          for(;i<arr.size();i++){
               int curr=arr.get(i);

               ArrayList<Integer> newComb=new ArrayList<>(comb);
               newComb.add(curr);

               combination(arr, newComb, res, k, i+1);
          }
     }
     public static void main(String[] args) {
          int n=4,k=2;
          System.out.println(combine(n, k));
     }
}
