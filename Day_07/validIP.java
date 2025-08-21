package DSA_Sheet.Day_07;

public class validIP {
     public static String validIPAddress(String IP) {
        int n=IP.length();

        int c=0;
        int ip=0;
        for(int i=0;i<n;i++){
            if(IP.charAt(i)=='.'){
                c++;
                ip=4;
            }
        }
        if(ip==4 && c!=3){
            return "Neither";
        }

        c=0;
        for(int i=0;i<n;i++){
            if(IP.charAt(i)==':'){
                c++;
                ip=6;
            }
        }
        if(ip==6 && c!=7){
            return "Neither";
        }

        String res="";
        if(ip==4){
            int num=0;
            String x[]=IP.split("[.]");
            if(x.length!=4){
                return "Neither";
            }
            for(int i=0;i<x.length;i++){
                if (x[i].length() == 0 || x[i].length()>3 || (x[i].length() > 1 && x[i].charAt(0) == '0')) return "Neither";
                num=0;
                for(int j=0;j<x[i].length();j++){
                    char ch=x[i].charAt(j);
                    if(ch>='0' && ch<='9'){
                        num=num*10+(ch-'0');
                    }else{
                        return "Neither";
                    }
                }
                if(num>255){
                    return "Neither";
                }
            }
            res="IPv4";
        }else if(ip==6){
            String x[]=IP.split("[:]");
            if(x.length != 8){
                return "Neither";
            }
            for(int i=0;i<x.length;i++){
                if(!(x[i].length()>=1 && x[i].length()<=4)){
                    return "Neither";
                }else{
                    String str=x[i];
                    for(int j=0;j<str.length();j++){
                        char ch=str.charAt(j);
                        if(!((ch>='a' && ch<='f') || (ch>='A' && ch<='F') || (ch>='0' && ch<='9'))){
                            return "Neither";
                        }
                    }
                }
            }
            res="IPv6";
        }else{
            res="Neither";
        }

        return res;
     }
     public static void main(String[] args) {
          String ip="254.65.53.20";
          System.out.println(validIPAddress(ip));
     }
}
