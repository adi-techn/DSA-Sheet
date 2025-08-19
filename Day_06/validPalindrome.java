package DSA_Sheet.Day_06;

public class validPalindrome {
     public static boolean palindrome(String str){
          String s=str.toLowerCase();
          StringBuilder sb=new StringBuilder();

          for(int i=0;i<s.length();i++){
               char ch=s.charAt(i);
               if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')||(ch>='0' && ch<='9')){
                    sb.append(ch);
               }
          }
          for(int i=0;i<sb.length()/2;i++){
               if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)){
                    return false;
               }
          }
          return true;
     }
     public static void main(String[] args) {
          String str="A man, a plan, a canal: Panama";
          System.out.println(palindrome(str));
     }
}
