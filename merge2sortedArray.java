public class merge2sortedArray {
     public static int[] mergeArr(int num1[],int m,int num2[],int n){
          int i=m-1;
          int j=n-1;
          int k=m+n-1;

          while(j>=0){
               if(i>=0 && num1[i]>num2[j]){
                    num1[k]=num1[i];
                    i--;
               }else{
                    num1[k]=num2[j];
                    j--;
               }
               k--;
          }
          return num1;
     }
     public static void main(String[] args) {
          int num1[]={1,2,3,0,0,0};
          int m=3;
          int num2[]={2,5,6};
          int n=num2.length;

          for(int x:mergeArr(num1,m,num2,n)){
               System.out.print(x+" ");
          }
     }
}
