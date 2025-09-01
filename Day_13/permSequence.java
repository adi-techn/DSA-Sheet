package DSA_Sheet.Day_13;

import java.util.ArrayList;
import java.util.List;

public class permSequence {
     static List<String> arr=new ArrayList<>();

     public static String getPermutation(int n, int k) {
          String str="";
          for(int i=1;i<=n;i++){
               str+=(i);
          }
          strPermutation(str,"");

          return arr.get(k-1);
     }
     public static void strPermutation(String str,String perm){
          if(str.length()==0){
               arr.add(perm);
               return;
          }
          for(int i=0;i<str.length();i++){
               char curr=str.charAt(i);
               String newStr=str.substring(0,i)+str.substring(i+1);
               strPermutation(newStr,perm+curr);
          }
     }
     public static void main(String[] args) {
          int n=9,k=32000;
          System.out.println(getPermutation(n, k));
     }
}
