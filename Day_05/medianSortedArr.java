public class medianSortedArr {
     public static double median(int nums1[],int nums2[]){
          int n=nums1.length;
          int m=nums2.length;

          int nums[]=new int[n+m];
          int k=nums.length-1;

          int i=n-1,j=m-1;

          while(i>=0 && j>=0){
               if(nums1[i]>nums2[j]){
                    nums[k--]=nums1[i--];
               }else{
                    nums[k--]=nums2[j--];
               }
          }
          while(i>=0){
               nums[k--]=nums1[i--];
          }
          while(j>=0){
               nums[k--]=nums1[j--];
          }
          if(nums.length%2==0){
               double med=(nums[nums.length/2]+nums[nums.length/2-1]);
               return med/2;
          }else{
               return nums[nums.length/2];
          }
     }
     public static void main(String[] args) {
          int arr1[]={1,2};
          int arr2[]={3,4};

          System.out.println("Median : "+median(arr1, arr2));
     }
}
