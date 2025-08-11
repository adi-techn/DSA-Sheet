package Day_02;

public class mostWater {
     public static int maxArea(int height[]){
          int si=0,ei=height.length-1,max=0;
          while(si<ei){
               int h=Math.min(height[si],height[ei]);
               int w=ei-si;
               int area=h*w;
               max=Math.max(max, area);
               if(height[si]<height[ei]){
                    si++;
               }else{
                    ei--;
               }
          }
          return max;
     }
     public static void main(String[] args) {
          int arr[]={1,8,6,2,5,4,8,3,7};
          System.out.println(maxArea(arr));
     }
}
