package DSA_Sheet.Day_11;

public class strPermutation {
     public static void permutation(String str,String prem,int idx){
          if(str.length()==0){
               System.out.println(prem);
               return;
          }
          for(int i=0;i<str.length();i++){
               char currChar=str.charAt(i);
               String newStr=str.substring(0,i)+str.substring(i+1);
               permutation(newStr, prem+currChar, idx+1);
          }
     }
     public static void main(String[] args) {
          String str="ABC";
          permutation(str,"",0);
     }    
}
