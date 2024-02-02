package self;

import java.util.Arrays;

public class arr4 {

    static void swapno(int a,int b){
        int temp=a;
        a=b;
        b=temp;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }



    private static void swapno1(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a is "+a+"  and  "+"b is "+b);
    }



    static void reversearray(int[]arr){
        int n= arr.length;

        int[]br=new int[n];
        int j=n-1;
        for (int i = 0; i < arr.length ; i++) {
            br[j--]=arr[i];

        }

        System.out.println(Arrays.toString(br));
    }


    static void rev1(int[]ar){
        for (int i = 0,j= ar.length-1; i <ar.length ; i++,j--) {
            System.out.print(ar[j]+" ");

        }
    }




    private static int[] rotatearray(int[] cr, int i) {

        int n=cr.length;
        i=i%n;

        int[]ans=new int[n];
        int j=0;

        for (int k = n-i; k < n; k++) {
            ans[j++]=cr[k];

        }

        for (int k = 0; k < n-i; k++) {

            ans[j++]=cr[k];

        }

        return ans;
    }



    static void swaparrayele(int[]ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;


        System.out.print(ar[i]+" "+ar[j]);
    }


    static void reverse(int[]arr,int i,int j){
        while(i<j){
            swaparrayele(arr,i,j);
            i++;
            j--;
        }
    }

    static void rotatele(int[]ar,int k){
        int n= ar.length;
        reverse(ar,0,n-k-1);
        reverse(ar,n-k,n-1);
        reverse(ar,0,n-1);

        System.out.println(Arrays.toString(ar));
    }


    public static void main(String[] args) {

        int a=89;
        int b=90;

       //  swapno(a,b);

        // swapno1(a,b);


        int []cr={1,2,3,4,5,6,7,8,9};

      //  reversearray(cr);

      //  rev1(cr);


       int[]ans= rotatearray(cr,7);

      //  System.out.println(Arrays.toString(ans));
        int[]ar={1,2};

       // swaparrayele(ar,0,1);


        rotatele(cr,7);
    }

}
