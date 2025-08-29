package DSA_Sheet.Day_10;

public class substringWithRepeatedChar {
     public static int substr(String str,int si,int ei){
          if(si>ei){
               return 0;
          }

          int firstSubstr=substr(str, si, ei-1);
          int lastSubstr=substr(str, si+1, ei);
          int midSubstr=substr(str,si+1,ei-1);

          int ans=firstSubstr+lastSubstr-midSubstr;

          if(str.charAt(si)==str.charAt(ei)){
               ans++;
          }

          return ans;
     }
     public static void main(String[] args) {
          String str="ababa";
          System.out.println(substr(str, 0, str.length()-1));
     }
}
