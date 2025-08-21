package DSA_Sheet.Day_07;

import java.util.Stack;

public class basicCalculator {
     public static int calculate(String str){
          Stack<Integer> s=new Stack<>();

          int sum=0,num=0,sign=1;

          for(int i=0;i<str.length();i++){
               char ch=str.charAt(i);
               if(ch>='0' && ch<='9'){
                    num=num*10+(ch-'0');
               }
               else if(ch=='+'){
                    sum+=sign*num;
                    num=0;
                    sign=1;
               }
               else if(ch=='-'){
                    sum+=sign*num;
                    num=0;
                    sign=-1;
               }
               else if(ch=='('){
                    s.push(sum);
                    s.push(sign);
                    sum=0;
                    sign=1;
               }
               else if(ch==')'){
                    sum+=sign*num;
                    num=0;
                    int prevSign=s.pop();
                    int prevSum=s.pop();
                    sum=prevSum+(prevSign*sum);
               }
          }
          if(num!=0){
               sum+=(sign*num);
          }
          return sum;
     }
     public static void main(String[] args) {
          String str="(1+(4+5+2)-3)+(6+8)";
          System.out.println(calculate(str));
     }
}
