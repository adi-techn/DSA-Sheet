package DSA_Sheet.Day_14;

public class atoi {
     public static int Atoi(String s){
          long res=0;
          int i=0;
          boolean isNeg=false,isSeen=false;

          while(i<s.length()){
               char ch=s.charAt(i++);
               if(ch==' ' && res==0 && !isSeen){
                    continue;
               }
               else if((ch=='-'|| ch=='+') && res==0 && !isSeen){
                    isNeg=(ch=='-');
                    isSeen=true;
               }else if(!(ch>='0' && ch<='9')){
                    break;
               }else{
                    res=res*10+(ch-'0');
                    isSeen=true;

                    if(!isNeg && res>Integer.MAX_VALUE){
                         return Integer.MAX_VALUE;
                    }else if(isNeg && -res<Integer.MIN_VALUE){
                         return Integer.MIN_VALUE;
                    }
               }
          }
          if(isNeg){
               res=-res;
          }

          return (int)res;
     }
     public static void main(String[] args) {
          String s="  -042ad5";
          System.out.println(Atoi(s));
     }
}
