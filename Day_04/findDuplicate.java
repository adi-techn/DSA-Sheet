package Day_04;

import java.util.HashMap;

public class findDuplicate {
     public static int duplicate(int arr[]){
          HashMap<Integer,Integer> hm=new HashMap<>();
          for(int x:arr){
               hm.put(x,hm.getOrDefault(x, 0)+1);
          }
          for(int key:hm.keySet()){
               if(hm.get(key)>1){
                    return key;
               }
          }
          return -1;
     }
     public static void main(String[] args) {
          int arr[]={1,3,4,2,2};
          System.out.println(duplicate(arr));
     }
}
