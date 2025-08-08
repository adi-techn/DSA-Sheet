import java.util.*;

public class majorityElement {
     public static int majElement(int[] arr) {
          int n=arr.length;
          HashMap<Integer,Integer> hm=new HashMap<>();
          for(int x:arr){
               hm.put(x,hm.getOrDefault(x,0)+1);
          }
          for(int key:hm.keySet()){
               int val=hm.get(key);
               if(val>(n/2)){
                    return key;
               }
          }
          return 0;
     }
     public static void main(String[] args) {
          int nums[]={3,2,3};
          System.out.println(majElement(nums));
     }
}
