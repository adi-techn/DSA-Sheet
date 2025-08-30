package DSA_Sheet.Day_12;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
     public static List<List<String>> solveNqueen(int n){
          List<List<String>> allBoards=new ArrayList<>();
          char board[][]=new char[n][n];

          Nqueen(allBoards,board,0);

          return allBoards;
     }
     public static void Nqueen(List<List<String>> allBoards,char board[][],int col){
          if(col==board.length){
               addBoard(allBoards,board);
               return;
          }

          for(int i=0;i<board.length;i++){
               if(is_Safe(i,col,board)){
                    board[i][col]='Q';
                    Nqueen(allBoards, board, col+1);
                    board[i][col]='.';
               }
          }
     }
     public static boolean is_Safe(int row,int col,char board[][]){
          //Horizontal
          for(int j=0;j<board.length;j++){
               if(board[row][j]=='Q'){
                    return false;
               }
          }
          //Vertical
          for(int i=0;i<board.length;i++){
               if(board[i][col]=='Q'){
                    return false;
               }
          }
          //Upper left
          int r=row;
          for(int c=col;c>=0 && r>=0;r--,c--){
               if(board[r][c]=='Q'){
                    return false;
               }
          }
          //Upper right
          r=row;
          for(int c=col;c<board.length && r>=0;r--,c++){
               if (board[r][c]=='Q') {
                    return false;
               }
          }
          //Lower left
          r=row;
          for(int c=col;c>=0 && r<board.length;c--,r++){
               if(board[r][c]=='Q'){
                    return false;
               }
          }
          //Lower right
          for(int c=col; c<board.length && r<board.length;r++,c++){
               if(board[r][c]=='Q'){
                    return false;
               }
          }
          return true;
     }
     public static void addBoard(List<List<String>> allBoards,char board[][]){
          String row="";
          List<String> newBoard=new ArrayList<>();

          for(int i=0;i<board.length;i++){
               row="";
               for(int j=0;j<board.length;j++){
                    if(board[i][j]=='Q'){
                         row+='Q';
                    }else{
                         row+='.';
                    }
               }
               newBoard.add(row);
          }
          allBoards.add(newBoard);
     }

     public static void main(String[] args) {
          int n=4;
          System.out.println(solveNqueen(n));
     }
}
