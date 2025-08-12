package Day_04;

import java.util.HashMap;

public class subarrSum {
     public static int subArrSum(int arr[],int k){
          int sum=0,count=0;

          HashMap<Integer,Integer> hm=new HashMap<>();

          hm.put(0,1);

          for(int i=0;i<arr.length;i++){
               sum+=arr[i];
               if(hm.containsKey(sum-k)){
                    count+=hm.get(sum-k);
               }
               hm.put(sum, hm.getOrDefault(hm, 0)+1);
          }
          return count;
     }
     public static void main(String[] args) {
          int arr[]={1,2,3};
          System.out.println(subArrSum(arr, 3));
     }
}
