public class buySellStock {
     public static int maxProfit(int price[]){
          int buy=Integer.MAX_VALUE;
          int maxProfit=0;

          for(int i=0;i<price.length;i++){
               if(buy<price[i]){
                    int profit=price[i]-buy;
                    maxProfit=Math.max(maxProfit, profit);
               }else{
                    buy=price[i];
               }
          }
          return maxProfit;
     }
     public static void main(String[] args) {
          int prices[]={7,1,5,3,6,4};
          System.out.println(maxProfit(prices));
     }
}
