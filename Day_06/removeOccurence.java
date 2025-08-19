package DSA_Sheet.Day_06;

import java.util.Stack;

public class removeOccurence {
     public static String removeOccur(String str,String part){
          Stack<Character> s=new Stack<>();

          for(int i=0;i<str.length();i++){
               char ch=str.charAt(i);
               s.push(ch);

               int c=0,j=part.length()-1,k=s.size()-1;
               while(j>=0 && k>=0 && s.get(k)==part.charAt(j)){
                    c++;j--;k--;
               }
               if(c==part.length()){
                    while(c!=0){
                         s.pop();
                         c--;
                    }
               }
          }
          StringBuilder sb=new StringBuilder();
          while(!s.isEmpty()){
               sb.append(s.pop());
          }
          sb.reverse();
          return sb.toString();
     }
     public static void main(String[] args) {
          String str="axxxxyyyyb";
          String part="xy";
          System.out.println(removeOccur(str, part));
     }
}
