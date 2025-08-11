package Day_03;

public class nextPermutation {
     static int nums[]={1,2,3};

     public static void nextPerm(int nums[]){
          int i=nums.length-1;
          while(i>0 && nums[i]<=nums[i-1]){
               i--;
          }

          if(i==0){
               reverse(nums,0,nums.length-1);
               return;
          }

          int j=nums.length-1;
          while (j>=i && nums[j]<=nums[i-1]) {
               j--;
          }
          swap(nums,i-1,j);
          reverse(nums,i,nums.length-1);
          return;
     }
     public static void swap(int nums[],int i,int j){
          int temp=nums[i];
          nums[i]=nums[j];
          nums[j]=temp;
          return ;
     }
     public static void reverse(int nums[],int si,int ei){
          while(si<ei){
               int temp=nums[si];
               nums[si]=nums[ei];
               nums[ei]=nums[temp];
               si++;
               ei--;
          }
     }
     public static void main(String[] args) {
          nextPerm(nums);
          for(int x:nums){
               System.out.print(x+" ");
          }
     }
}
