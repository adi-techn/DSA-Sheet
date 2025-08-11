package Day_02;

public class kadaneAlgo {
     public static int maxSumSubarr(int arr[]){
          if(arr.length==1){
               return arr[0];
          }

          int currSum=0;
          int maxSum=Integer.MIN_VALUE;

          for(int i=0;i<arr.length;i++){
               currSum+=arr[i];
               if(currSum<0){
                    currSum=0;
               }
               maxSum=Math.max(maxSum, currSum);
          }
          return maxSum;
     }
     public static void main(String[] args) {
          int arr[]={-2,1,-3,4,-1,2,1,-5,4};
          System.out.println(maxSumSubarr(arr));
     }
}
