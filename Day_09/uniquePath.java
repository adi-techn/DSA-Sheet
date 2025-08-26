package Day_09;

import java.util.*;

public class uniquePath {
     public static int totalPath(int m,int n){
          int dp[][]=new int[m][n];
          for(int row[]:dp){
               Arrays.fill(row,-1);
          }

          return move(m,n,dp,0,0);
     }
     public static int move(int m,int n,int dp[][],int i,int j){
          if(i==m-1 && j==n-1){
               return 1;
          }
          if(i>=m || j>=n){
               return 0;
          }
          if(dp[i][j]!=-1){
               return dp[i][j];
          }

          return dp[i][j]=move(m,n,dp,i+1,j)+move(m,n,dp,i,j+1);
     }
     public static void main(String[] args) {
          int m=3,n=7;
          System.out.println(totalPath(m, n));
     }
}
