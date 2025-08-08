public class singleNum {
     public static int singleNumber(int arr[]){
          int num=0;
          for(int x:arr){
               num^=x;
          }
          return num;
     }
     public static void main(String[] args) {
          int arr[]={1,2,3,4,3,2,1};
          System.out.println(singleNumber(arr));
     }
}
