package DSA_Sheet.Day_11;

import java.util.HashMap;
import java.util.HashSet;

public class maxOccurOfSubstr {
     public static int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
          int n=s.length();

          HashMap<String,Integer> hm=new HashMap<>();

          for(int i=0;i<=n-minSize;i++){
               String l=s.substring(i,i+minSize);
               if(isUnique(l,maxLetters)){
                    hm.put(l,hm.getOrDefault(l,0)+1);
               }
          }

          int max=0;
          for(String key:hm.keySet()){
               max=Math.max(max,hm.get(key));
          }

          return max;
     }
     public static boolean isUnique(String str,int max){
          HashSet<Character> hs=new HashSet<>();

          for(int i=0;i<str.length();i++){
               hs.add(str.charAt(i));
               if(hs.size()>max){
                    return false;
               }
          }
          return true;
     }
     public static void main(String[] args) {
          String s = "aababcaab";
          int maxLetters = 2, minSize = 3, maxSize = 4;
          System.out.println(maxFreq(s, maxLetters, minSize, maxSize));
     }
}
