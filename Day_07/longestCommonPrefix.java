package DSA_Sheet.Day_07;

public class longestCommonPrefix {
     public static String lcp(String strs[]){
          if(strs.length==0){
               return "";
          }

          String pre=strs[0];
          int preLen=pre.length();

          for(int i=1;i<strs.length;i++){
               String s=strs[i];
               while(preLen>s.length() || !pre.equals(s.substring(0,preLen))){
                    preLen--;
                    if(preLen==0){
                         return "";
                    }
                    pre=pre.substring(0, preLen);
               }
          }
          return pre;
     }
     public static void main(String[] args) {
          String strs[]={"flower","flow","flight"};
          System.out.println(lcp(strs));
     }
}
