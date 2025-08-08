
import java.util.HashMap;

public class repeat_missingValue {
     public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int res[]=new int[2];
        int n=grid.length;

        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                hm.put(grid[i][j],hm.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i=1;i<=n*n;i++){
            if(hm.containsKey(i)){
                if(hm.get(i)!=1){
                    res[0]=i;
                }
            }else{
                res[1]=i;
            }
        }
        return res;
     }
     public static void main(String[] args) {
          int grid[][]={{1,3},{2,2}};
          for(int x:findMissingAndRepeatedValues(grid)){
               System.out.print(x+" ");
          }
     }
}
