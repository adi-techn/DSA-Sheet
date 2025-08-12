package Day_04;

public class countInversion {
     static int arr[]={2,4,1,8,5};
     public static int mergeSort(int arr[],int si,int ei){
          int mid=(si+ei)/2;
          if(si>=ei){
               return 0;
          }

          int count=0;

          count+=mergeSort(arr, si, mid);
          count+=mergeSort(arr, mid+1, ei);
          count+=merge(arr,si,mid,ei);

          return count;
     }
     public static int merge(int arr[],int si,int mid,int ei){
          int temp[]=new int[ei-si+1];
          int i=si;
          int j=mid+1;
          int k=0;

          int count=0;

          while(i<=mid && j<=ei){
               if(arr[i]<=arr[j]){
                    temp[k]=arr[i++];
               }else{
                    temp[k]=arr[j++];
                    count+=(mid-i+1);
               }
               k++;
          }
          while(i<=mid){
               temp[k++]=arr[i++];
          }
          while (j<=ei) {
               temp[k++]=arr[j++];
          }
          for(int l=0;l<temp.length;l++){
               arr[si+l]=temp[l];
          }
          
          return count;
     }
     public static void main(String[] args) {
          
          System.out.println(mergeSort(arr, 0, arr.length-1));
          for(int x:arr){
               System.out.print(x+" ");
          }
     }
}
