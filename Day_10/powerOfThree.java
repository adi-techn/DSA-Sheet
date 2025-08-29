package DSA_Sheet.Day_10;

public class powerOfThree {
     public static boolean isPowerOfTwo(int n,int x){
        if(n==Math.pow(2,x)){
            return true;
        }
        if(Math.pow(2,x)>n){
            return false;
        }

        return isPowerOfTwo(n, x+1);
     }
     public static boolean isPowerOfThree(int n,int x){
          if(n==Math.pow(3,x)){
               return true;
          }
          if(Math.pow(3,x)>n){
               return false;
          }

          return isPowerOfThree(n, x+1);
     }
     public static void main(String[] args) {
          int n=8;

          System.out.println(isPowerOfThree(n, 0));
     }
}
