package DSA_Sheet.Day_15;

import java.util.*;

public class subset2 {
     public static List<List<Integer>> subsetsWithDup(int[] nums) {
          Arrays.sort(nums);
          List<List<Integer>> res = new ArrayList<>();
          res.add(new ArrayList<>());

          int st, end = 0;
          for (int j = 0; j < nums.length; j++) {
               st = 0;

               if (j > 0 && nums[j] == nums[j - 1]) {
                    st = end + 1;
               }
               end = res.size() - 1;
               int size = res.size();
               for (int i = st; i < size; i++) {
                    List<Integer> arr = new ArrayList<>(res.get(i));
                    arr.add(nums[j]);
                    res.add(arr);
               }
          }
          return res;
     }
     public static void main(String[] args) {
          int nums[]={1,2,2};
          System.out.println(subsetsWithDup(nums));
     }
}
