package Day_02;

import java.util.*;

public class threeSum {
     public static List<List<Integer>> three_Sum(int arr[]){
          List<List<Integer>> res=new ArrayList<>();

          Arrays.sort(arr);

          for(int i=0;i<arr.length;i++){
               if(i>0 && arr[i]==arr[i-1]){
                    continue;
               }

               int j=i+1;
               int k=arr.length-1;

               while(j<k){
                    int total=arr[i]+arr[j]+arr[k];

                    if(total>0){k--;}
                    else if(total<0){j++;}
                    else{
                         res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                         j++;

                         while(arr[j]==arr[j-1] && j<k){j++;}

                    }
               }
          }
          return res;
     }
     public static void main(String[] args) {
          int arr[]={-1,0,1,2,-1,-4};
          System.out.println(three_Sum(arr));
     }
}
