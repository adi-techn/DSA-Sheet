package Day_09;

public class sumOfThree {
     public static long[] sum_of_three(long num){
          long res[]=new long[3];
          long x=num/3;

          long sum=(x-1)+x+(x+1);
          if(sum==num){
               res[0]=x-1;
               res[1]=x;
               res[2]=x+1;

               return res;
          }else{
               return new long[0];
          }
     }
     public static void main(String[] args) {
          int n=33;
          for(long x:sum_of_three(n)){
               System.out.print(x+" ");
          }
     }
}
