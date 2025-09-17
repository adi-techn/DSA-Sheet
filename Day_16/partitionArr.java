package DSA_Sheet.Day_16;

import java.util.*;

public class partitionArr {
     public static int[] pivotArray(int nums[],int pivot){
          List<Integer> arr=new ArrayList<>();
          int res[]=new int[nums.length];
          int idx=0;
          for(int i=0;i<nums.length;i++){
               if(nums[i]==pivot){
                    arr.add(idx,nums[i]);
               }else if(nums[i]<pivot){
                    arr.add(idx,nums[i]);
                    idx++;
               }else{
                    arr.add(nums[i]);
               }
          }

          for(int i=0;i<nums.length;i++){
               res[i]=arr.get(i);
          }
          return res;
     }
     public static void main(String[] args) {
          int nums[]={9,12,5,10,14,3,10};
          int pivot=10;
          for(int x:pivotArray(nums, pivot)){
               System.out.print(x+" ");
          }
     }
}
