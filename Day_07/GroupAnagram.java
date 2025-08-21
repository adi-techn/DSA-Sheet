package DSA_Sheet.Day_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
     public static List<List<String>> anagrams(String strs[]){
          HashMap<String, List<String>> hm=new HashMap<>();

          for(int i=0;i<strs.length;i++){
               String word=strs[i];
               char ch[]=word.toCharArray();
               Arrays.sort(ch);
               String sorted=new String(ch);

               if(!hm.containsKey(sorted)){
                    hm.put(sorted,new ArrayList<>());
               }
               hm.get(sorted).add(word);
          }
          return new ArrayList<>(hm.values());
     }
     public static void main(String[] args) {
          String strs[]={"eat","tea","tan","ate","nat","bat"};
          System.out.println(anagrams(strs));
     }
}
