package DSA_Sheet.Day_06;

public class stringCompression {
     public static int strCompress(char ch[]){
          StringBuilder sb=new StringBuilder();
          int n=ch.length;

          int c=1;
          for(int i=0;i<n-1;i++){
               if(ch[i]==ch[i+1]){
                    c++;
               }else{
                    sb.append(ch[i]);
                    if(c>1){
                         sb.append(c);
                    }
                    c=1;
               }
          }
          sb.append(ch[n-1]);
          if(c>1){sb.append(c);}

          return sb.length();
     }
     public static void main(String[] args) {
          char ch[]={'a','a','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};
          System.out.println(strCompress(ch));
     }
}
