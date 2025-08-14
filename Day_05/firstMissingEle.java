import java.util.Arrays;
import java.util.HashSet;

public class firstMissingEle {
     public static int missingElement(int nums[]){
          int n=nums.length;

          HashSet<Integer> hs=new HashSet<>();

          for(int x:nums){
               hs.add(x);
          }

          Arrays.sort(nums);

          for(int i=1;i<=nums[n-1];i++){
               if(!hs.contains(i)){
                    return i;
               }
          }

          if(nums[n-1]<=0){
               return 1;
          }else{
               return nums[n-1]+1;
          }
     }
     public static void main(String[] args) {
          int arr[]={3,1,4,-1};
          System.out.println("First Missing Element : "+missingElement(arr));
     }
}
