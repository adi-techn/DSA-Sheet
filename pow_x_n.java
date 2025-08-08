public class pow_x_n {
     public static double pow(double x,long n){
          if(n==0){
               return 1;
          }
          if(n==1){
               return x;
          }
          if(n%2==1){        //odd exponential val
               return x*pow(x, n-1);
          }else{            //even expo val
               return pow(x*x, n/2);
          }
     }
     public static void main(String[] args) {
          double x=2.00;
          int n=10;
          long N=n;
          if(N<0){
               double val=pow(x, -N);
               System.out.println(1.0/val);
          }else{
               System.out.println(pow(x, N));
          }
     }
}
