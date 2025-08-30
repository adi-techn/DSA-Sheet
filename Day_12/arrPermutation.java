package DSA_Sheet.Day_12;

import java.util.*;

public class arrPermutation {
     public static List<List<Integer>> permute(int nums[]){
          List<Integer> arr=new ArrayList<>();
          for(int x:nums){
               arr.add(x);
          }
          List<List<Integer>> res=new ArrayList<>();

          permutation(arr,new ArrayList<>(),res);

          return res;
     }
     public static void permutation(List<Integer> arr,List<Integer> perm,List<List<Integer>> res){
          if(arr.size()==0){
               res.add(perm);
               return;
          }

          for(int i=0;i<arr.size();i++){
               int curr=arr.get(i);

               ArrayList<Integer> newArr=new ArrayList<>(arr);
               newArr.remove(i);

               ArrayList<Integer> newPerm=new ArrayList<>(perm);
               newPerm.add(curr);

               permutation(newArr, newPerm, res);
          }
     }
     public static void main(String[] args) {
          int nums[]={1,2,3};
          System.out.println(permute(nums));
     }
}
