package Day_08;

public class kthElementSortedArray {
     public static int kthElement(int[] a, int[] b, int k) {
        int m=a.length;
        int n=b.length;

        int res[]=new int[m+n];
        int l=res.length-1;

        int i=m-1,j=n-1;

        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                res[l--]=a[i];
                i--;
            }else{
                res[l--]=b[j];
                j--;
            }
        }
        while(i>=0){
            res[l--]=a[i];
            i--;
        }
        while(j>=0){
            res[l--]=b[j];
            j--;
        }

        return res[k-1];
     }
     public static void main(String[] args) {
          int a[]={2, 3, 6, 7, 9};
          int b[]={1, 4, 8, 10};
          int k=5;

          System.out.println(kthElement(a, b, k));
     }
}
