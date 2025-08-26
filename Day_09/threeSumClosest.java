package Day_09;

import java.util.Arrays;

public class threeSumClosest {
     public static int closest_Sum(int arr[],int target){
          int n=arr.length;
          int sum=0,min_diff=Integer.MAX_VALUE;

          Arrays.sort(arr);

          for(int i=0;i<n-1;i++){
               int k=i+1,l=n-1;

               while(k<l){
                    int total=arr[i]+arr[k]+arr[l];
                    if(total==target){
                         return target;
                    }
                    else{
                         int diff=Math.abs(target-total);
                         if(min_diff>diff){
                              min_diff=diff;
                              sum=total;
                         }
                         if(total<target){
                              k++;
                         }else{
                              l--;
                         }
                    }
               }
          }
          return sum;
     }
     public static void main(String[] args) {
          int arr[]={-1,2,1,-4};
          int target=1;

          System.out.println(closest_Sum(arr, target));
     }
}
