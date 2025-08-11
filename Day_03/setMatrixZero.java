package Day_03;

import java.util.*;

public class setMatrixZero {
     public static int[][] setZero(int mat[][]){
          List<List<Integer>> arr=new ArrayList<>();

          for(int i=0;i<mat.length;i++){
               for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j]==0){
                         List<Integer> arr1=new ArrayList<>();
                         arr1.add(i);
                         arr1.add(j);
                         arr.add(arr1);
                    }
               }
          }

          int k=0;
          while(k<arr.size()){
               int r=arr.get(k).get(0);
               for(int j=0;j<mat[0].length;j++){
                    mat[r][j]=0;
               }
               int c=arr.get(k).get(1);
               for(int i=0;i<mat.length;i++){
                    mat[i][c]=0;
               }
               k++;
          }

          return mat;
     }
     public static void main(String[] args) {
          int mat[][]={{1,1,1},{1,0,1},{1,1,1}};
          int res[][]=setZero(mat);

          for(int i=0;i<res.length;i++){
               for(int j=0;j<res[0].length;j++){
                    System.out.print(res[i][j]+" ");
               }
               System.out.println();
          }
     }
}
