package Day_09;

import java.util.*;

public class longestConsecutiveSequence {
     public static int longest_Consecutive_Sequence(int nums[]){
          if(nums.length==0){
               return 0;
          }

          HashSet<Integer> hs=new HashSet<>();
          for(int x:nums){
               hs.add(x);
          }

          int arr[]=new int[hs.size()];
          int i=0;
          for(int x:hs){
               arr[i++]=x;
          }

          Arrays.sort(arr);

          int max=1,c=1,n=arr.length;
          for(int j=0;j<n-1;j++){
               if(arr[j]==arr[j+1]-1){
                    c++;
               }else{
                    c=1;
               }
               max=Math.max(max, j);
          }

          return max;
     }
     public static void main(String[] args) {
          int arr[]={100,4,200,1,3,2};
          System.out.println(longest_Consecutive_Sequence(arr));
     }
}
