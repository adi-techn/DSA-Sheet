package Day_03;

public class wordSearch {
     public static boolean exists(char board[][],String word){
          int m=board.length;
          int n=board[0].length;

          boolean result=false;
          boolean visited[][]=new boolean[m][n];

          for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                    if(board[i][j]==word.charAt(0)){
                         result=backtrack(board,word,visited,i,j,0);
                         if(result){
                              return true;
                         }
                    }
               }
          }

          return false;
     }
     public static boolean backtrack(char board[][],String word,boolean visited[][],int i,int j,int idx){
          if(idx==word.length()){
               return true;
          }

          if(i<0 || i>=board.length || j<0 || j>=board[0].length || visited[i][j] || board[i][j]!=word.charAt(idx)){
               return false;
          }

          visited[i][j]=true;
          if(backtrack(board, word, visited, i+1, j, idx+1)||
          backtrack(board, word, visited, i-1, j, idx+1)||
          backtrack(board, word, visited, i, j-1, idx+1)||
          backtrack(board, word, visited, i, j+1, idx+1)){
               return true;
          }

          visited[i][j]=false;
          return false;
     }
     public static void main(String[] args) {
          char board[][]={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
          String word="ABCCED";

          System.out.println(exists(board, word));
     }
}
