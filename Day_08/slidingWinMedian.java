package Day_08;

import java.util.*;

public class slidingWinMedian {
     public static double[] medianSlidingWindow(int[] nums, int k) {
        double res[]=new double[nums.length-k+1];

        ArrayList<Integer> arr=new ArrayList<>();
        int n=nums.length;

        for(int x:nums){
            arr.add(x);
        }

        int j=0;
        for(int i=0;i<=n-k;i++){
            List<Integer> arr1=new ArrayList<>(arr.subList(i,i+k));
            Collections.sort(arr1);

            int mid=k/2;

            if(k%2==0){
                res[j++]=(double)(arr1.get(mid) + arr1.get(mid-1))/2.0;
            }else{
                res[j++]=(double)arr1.get(mid);
            }
        }
        return res;
     }
     public static void main(String[] args) {
          int nums[]={1,3,-1,-3,5,3,6,7};
          int k=3;
          
          for(double x:medianSlidingWindow(nums, k)){
               System.out.print(x+" ");
          }
     }
}
