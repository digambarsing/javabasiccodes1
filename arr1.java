package self;

import java.util.Scanner;

public class arr1 {

    public static void sum(){
        int []arr1={1,2,3,4,5,5,10,20};
        int sum=0;
        for (int i = 0; i < arr1.length; i++) {
            sum=sum+arr1[i];

        }
        System.out.println(sum);
    }
    public static void max(){
        int []br={34,56,23,14,78,45,109,456,35};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < br.length; i++) {
            if (br[i]>max){
                max=br[i];
            }

        }
        System.out.println(max);

    }
    public static void search(int x){
        int []cr={23,56,78,90,87,65,43,12};
        int ans=-1;
        int p=x;
        int index=-1;
        for (int i = 0; i < cr.length; i++) {
            if(p==cr[i]){
                ans=cr[i];
                index=i;
                break;

            }


        }

        System.out.println(ans);
        System.out.println(index);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        // array is collection of similar data
        // contiguous memory allocation
        // 0 based indexing
        // memory heap and reference variable is in stack


        // array declaration

        int []arr=new int[5];
        int arr1[]={1,2,3,4,5};

        for (int i = 0; i < arr1.length; i++) {
           // System.out.println(arr1[i]);
        }
      //  System.out.println(" concept of foreach loop");
        for (int k:arr1) {
            //System.out.println(k);
        }
        sum();
        max();
        search(x);

    }
}
