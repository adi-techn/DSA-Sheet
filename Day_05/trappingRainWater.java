package Day_05;

public class trappingRainWater {
     public static int trap(int height[]){
          int n=height.length;

          int leftMax[]=new int[n];
          leftMax[0]=height[0];
          for(int i=1;i<n;i++){
               leftMax[i]=Math.max(height[i],leftMax[i-1]);
          }

          int rightMax[]=new int[n];
          rightMax[n-1]=height[n-1];
          for(int i=n-2;i>=0;i--){
               rightMax[i]=Math.max(height[i], rightMax[i+1]);
          }

          int wl[]=new int[n];
          int trapwater=0,width=1;
          for(int i=0;i<n;i++){
               wl[i]=Math.min(leftMax[i], rightMax[i]);
               trapwater+=(wl[i]-height[i])*width;
          }
          return trapwater;
     }
     public static void main(String[] args) {
          int heights[]={0,1,0,2,1,0,1,3,2,1,2,1};
          System.out.println(trap(heights));
     }
}
