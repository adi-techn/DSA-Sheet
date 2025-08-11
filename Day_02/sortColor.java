package Day_02;

public class sortColor {
     public static int[] sort_Color(int arr[]){
          int n=arr.length;
          for(int i=0;i<n-1;i++){
               for(int j=0;j<n-i-1;j++){
                    if(arr[j]>arr[j+1]){
                         int temp=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                    }
               }
          }
          return arr;
     }
     public static void main(String[] args) {
          int arr[]={2,0,2,1,1,0};
          for(int x:sort_Color(arr)){
               System.out.print(x+" ");
          }
     }
}
