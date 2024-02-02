package array_2D;

import java.util.Scanner;

public class rotate {

    static void printarray(int[][]ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");

            }
            System.out.println();

        }
    }

    static void inplacetransarray(int[][]a){

        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {

                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;


            }

        }
        System.out.println("transposed array");
        printarray(a);
    }

    static void reversearray(int[] arr){
        int i=0,j= arr.length-1;

        while (i < j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }

    static void rotatearray(int[][]ar){
        // transpose

        inplacetransarray(ar);

        // reverse a row

        for (int i = 0; i < 3; i++) {
            reversearray(ar[i]);

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]ar=new int[3][3];


        System.out.println("enter element");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j]= sc.nextInt();

            }

        }
        printarray(ar);

        System.out.println("after rotate");

        rotatearray(ar);

    }
}
