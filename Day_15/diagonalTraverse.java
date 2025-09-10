package DSA_Sheet.Day_15;

import java.util.*;

public class diagonalTraverse {
     public static int[] diagonal(int mat[][]){
          int m=mat.length,n=mat[0].length;
          int result[]=new int[m*n];
          int idx=0;

          List<List<Integer>> res=new ArrayList<>();

          for(int i=0;i<m;i++){
               int j=i,k=0;
               ArrayList<Integer> arr=new ArrayList<>();
               while(j>=0 && k<n){
                    arr.add(mat[j][k]);
                    j--;k++;
               }
               if(idx%2!=0){
                    Collections.reverse(arr);
               }
               res.add(arr);
               idx++;
          }

          //Bottom triangle
          for(int col=1;col<n;col++){
               int i=m-1,j=col;
               ArrayList<Integer> arr=new ArrayList<>();
               while (i>=0 && j<n) {
                    arr.add(mat[i][j]);
                    i--;j++;
               }
               if(idx%2!=0){
                    Collections.reverse(arr);
               }
               res.add(arr);
               idx++;
          }

          int k=0;
          for(List<Integer> arr:res){
               for(int i=0;i<arr.size();i++){
                    result[k++]=arr.get(i);
               }
          }

          return result;
     } 
     public static void main(String[] args) {
          int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
          for(int x:diagonal(mat)){
               System.out.print(x+" ");
          }
     }
}
