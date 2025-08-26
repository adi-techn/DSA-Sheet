package Day_09;

import java.util.*;

public class fourSum {
     public static List<List<Integer>> four_Sum(int arr[],int target){
          int n=arr.length;
          List<List<Integer>> res=new ArrayList<>();

          Arrays.sort(arr);

          for(int i=0;i<n;i++){
               if(i>0 && arr[i]==arr[i-1]){
                    continue;
               }

               for(int j=i+1;j<n;j++){
                    if(j>i+1 && arr[j]==arr[j-1]){
                         continue;
                    }

                    int k=j+1,l=n-1;
                    while(k<l){
                         long total=(long)arr[i]+arr[j]+arr[k]+arr[l];
                         if(total==target){
                              List<Integer> arr1=new ArrayList<>();
                              arr1.add(arr[i]);
                              arr1.add(arr[j]);
                              arr1.add(arr[k]);
                              arr1.add(arr[l]);
                              res.add(arr1);

                              k++;l--;

                              while(k<l && arr[k]==arr[k-1]){
                                   k++;
                              }
                              while(k<l && arr[l]==arr[l-1]){
                                   l--;
                              }
                         }else if(total<target){
                              k++;
                         }else{
                              l--;
                         }
                    }
               }
          }
          return res;
     }
     public static void main(String[] args) {
          int arr[]={1,0,-1,0,-2,2};
          int target=0;

          System.out.println(four_Sum(arr, target));
     }
}
