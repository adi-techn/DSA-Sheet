package DSA_Sheet.Day_11;

public class palinSubstr {
     public static int countPalinSubstr(String s){
          int n=s.length(),count=0;

          for(int i=0;i<n;i++){
               for(int j=i;j<n;j++){
                    count+=(isPalin(s.substring(i,j+1)))?1:0;
               }
          }

          return count;
     }
     public static boolean isPalin(String str){
          int si=0,ei=str.length()-1;

          while(si<ei){
               if(str.charAt(si)!=str.charAt(ei)){
                    return false;
               }
               si++;ei--;
          }

          return true;
     }
     public static void main(String[] args) {
          String str="aaa";
          System.out.println(countPalinSubstr(str));
     }
}
