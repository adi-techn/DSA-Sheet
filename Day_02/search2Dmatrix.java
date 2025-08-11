package Day_02;

public class search2Dmatrix {
     public static boolean searchMatrix(int arr[][],int target){
          for(int i=0;i<arr.length;i++){
               if(target>arr[i][arr[i].length-1]){
                    continue;
               }else{
                    int si=0,ei=arr[i].length-1;
                    while(si<=ei){
                         int mid=si+(ei-si)/2;
                         if(arr[i][mid]==target){
                              return true;
                         }else if(arr[i][mid]<target){
                              si=mid+1;
                         }else{
                              ei=mid-1;
                         }
                    }
               }
          }
          return false;
     }
     public static void main(String[] args) {
          int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
          System.out.println(searchMatrix(arr, 2));
     }
}
