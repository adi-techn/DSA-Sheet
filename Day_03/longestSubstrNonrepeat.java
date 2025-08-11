package Day_03;

import java.util.HashSet;

public class longestSubstrNonrepeat {
     public static int maxLenSubstr(String str){
          int max=0;
          for(int i=0;i<str.length();i++){
               int c=0;
               HashSet<Character> hs=new HashSet<>();
               for(int j=i;j<str.length();j++){
                    if(hs.contains(str.charAt(j))){
                         break;
                    }
                    hs.add(str.charAt(j));
                    c++;
                    max=Math.max(max,c);
               }
          }
          return max;
     }
     public static void main(String[] args) {
          String str="bbbbb";
          System.out.println(maxLenSubstr(str));
     }
}
