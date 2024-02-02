package sorting;

public class insert {
    public static void main(String[] args) {

        int[]a={4,3,7,5,9,1};
        insertsort(a);
        for(int k:a){
            System.out.print(k+" ");
        }
    }

    private static void insertsort(int[] a) {
        int n=a.length;
        for (int i=1;i<n;i++){
            int j=i;
            while (j>0 && a[j]<a[j-1]){
                int t=a[j];
                a[j]=a[j-1];
                a[j-1]=t;
                j--;

            }
        }
    }
}
