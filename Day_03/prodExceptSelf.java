package Day_03;

public class prodExceptSelf {
     public static int[] prod_exceptSelf(int nums[]){
          int ans[]=new int[nums.length];

          int pre=1,suf=1;
          for(int i=0;i<nums.length;i++){
               ans[i]=1;
          }

          for(int i=0;i<nums.length;i++){
               ans[i]*=pre;
               pre*=nums[i];
          }
          for(int j=nums.length-1;j>=0;j--){
               ans[j]*=suf;
               suf*=nums[j];
          }
          
          return ans;
     }
     public static void main(String[] args) {
          int nums[]={1,2,3,4};
          for(int x:prod_exceptSelf(nums)){
               System.out.print(x+" ");
          }
     }
}
