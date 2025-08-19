package DSA_Sheet.Day_06;

public class permutationString {

     public static boolean permutation(String s1,String s2){
          int n=s1.length(),m=s2.length();

          if(n>m){
               return false;
          }

          int s1Freq[]=new int[26];
          int s2Freq[]=new int[26];

          for(int i=0;i<n;i++){
               s1Freq[s1.charAt(i)-'a']++;
               s2Freq[s2.charAt(i)-'a']++;
          }
          for(int i=0;i<m-n;i++){
               if(match(s1Freq,s2Freq)){
                    return true;
               }
               s2Freq[s2.charAt(i)-'a']--;
               s2Freq[s2.charAt(i+n)-'a']++;
          }
          return false;
     }
     private static boolean match(int s1[],int s2[]){
          for(int i=0;i<26;i++){
               if(s1[i]!=s2[i]){
                    return false;
               }
          }
          return true;
     }
     public static void main(String[] args) {
          String s1="ab", s2="eidbaooo";
          System.out.println(permutation(s1, s2));
     }
}
