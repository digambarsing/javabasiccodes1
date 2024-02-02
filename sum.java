package array_2D;

import java.util.Scanner;

public class sum {
    static void printarray(int[][]ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");

            }
            System.out.println();

        }
    }
    static void sumof2D(int[][]a,int r,int c,int[][]b,int r1,int c1){
        if (r != r1 || c != c1){
            System.out.println("not valid input");
            return;
        }

        int[][]sum=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c ; j++) {
                sum[i][j]=a[i][j]+b[i][j];


            }

        }
        printarray(sum);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();

        int r1 = sc.nextInt();
        int c1= sc.nextInt();

        int[][]a=new int[r][c];

        System.out.println("enter element");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j]= sc.nextInt();

            }

        }

        int[][]b=new int[r1][c1];
        System.out.println("enter element");
        for (int i = 0; i <r1 ; i++) {
            for (int j = 0; j < c1; j++) {
                b[i][j]= sc.nextInt();

            }

        }

        sumof2D(a,r,c,b,r1,c1);


    }
}
