package DSA_Sheet.Day_15;

import java.util.*;

public class kDiffPair {
     public static int kDiff(int arr[],int k){
          int n=arr.length;
          int c=0;
          
          Arrays.sort(arr);

          for(int i=0;i<n-1;i++){
               if(i>0 && arr[i-1]==arr[i]){
                    continue;
               }
               for(int j=i+1;j<n;j++){
                    int diff=Math.abs(arr[i]-arr[j]);
                    if(diff==k){
                         c++;
                         break;
                    }
               }
          }
          return c;
     }
     public static void main(String[] args) {
          int nums[]={1,2,3,4,5};
          int k=1;
          System.out.println(kDiff(nums, k));
     }
}
