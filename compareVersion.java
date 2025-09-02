package DSA_Sheet.Day_14;

import java.util.*;

public class compareVersion {
     public static int compareVersionNumber(String ver1,String ver2){
          List<String> v1=new ArrayList<>(Arrays.asList(ver1.split("\\.")));
          List<String> v2=new ArrayList<>(Arrays.asList(ver2.split("\\.")));

          if(v1.size()!=v2.size()){
               int diff=Math.abs(v1.size()-v2.size());
               if(v1.size()<v2.size()){
                    while(diff!=0){
                         v1.add("0");
                         diff--;
                    }
               }else{
                    while (diff!=0) {
                         v2.add("0");
                         diff--;
                    }
               }
          }
          int i=0;
          while(i<v1.size()){
               int n1=Integer.parseInt(v1.get(i));
               int n2=Integer.parseInt(v2.get(i));

               if(n1<n2){
                    return -1;
               }else if(n1>n2){
                    return 1;
               }
               i++;
          }

          return 0;
     }
     public static void main(String[] args) {
          String ver1="1.2",ver2="1.10";
          System.out.println(compareVersionNumber(ver1, ver2));
     }
}
