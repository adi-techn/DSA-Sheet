package DSA_Sheet.Day_16;

import java.util.LinkedList;
import java.util.Queue;

public class roundTableGame {
     public static int round(int n,int k){
          Queue<Integer> q=new LinkedList<>();

          for(int i=1;i<=n;i++){
               q.add(i);
          }

          while(q.size()!=1){
               for(int i=1;i<k;i++){
                    q.add(q.poll());
               }
               q.remove();
          }

          return q.poll();
     }
     public static void main(String[] args) {
          System.out.println(round(5, 2));
     }
}
