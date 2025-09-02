package DSA_Sheet.Day_14;

public class countAndSay {
     public static String count_say(int n){
          String s="1";
          for(int i=2;i<=n;i++){
               s=rle(s);
          }
          return s;
     }
     public static String rle(String str){
          StringBuilder sb=new StringBuilder();
          int i=0,count=1;

          while(i<str.length()-1){
               if(str.charAt(i)==str.charAt(i+1)){
                    count++;
               }else{
                    sb.append(count);
                    sb.append(str.charAt(i));
                    count=1;
               }
               i++;
          }

          sb.append(count);
          sb.append(str.charAt(str.length()-1));

          return sb.toString();
     }
     public static void main(String[] args) {
          int n=4;
          System.out.println(count_say(n));
     }
}
