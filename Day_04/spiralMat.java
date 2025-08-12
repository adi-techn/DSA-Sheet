package Day_04;

public class spiralMat {
     public static int[] spiralMatrix(int mat[][]){
          int sr=0,sc=0;
          int er=mat.length-1,ec=mat[0].length-1;

          int res[]=new int[mat.length*mat[0].length];
          int k=0;

          while(sr<=er && sc<=ec){
               for(int j=sc;j<=ec;j++){
                    res[k++]=mat[sr][j];
               }
               for(int i=sr+1;i<=er;i++){
                    res[k++]=mat[i][ec];
               }
               for(int j=ec-1;j>=sc;j--){
                    if(sr==er){break;}
                    res[k++]=mat[er][j];
               }
               for(int i=er-1;i>=sr+1;i--){
                    if(sc==ec){break;}
                    res[k++]=mat[i][sc];
               }
               sr++;sc++;
               er--;ec--;
          }
          return res;
     }
     public static void main(String[] args) {
          int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
          for(int x:spiralMatrix(mat)){
               System.out.print(x+" ");
          }
     }
}
