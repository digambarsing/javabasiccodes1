package array_2D;

import java.util.Scanner;

public class multiply {
    static void printarray(int[][]ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");

            }
            System.out.println();

        }
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

        mulof2D(a,r,c,b,r1,c1);


    }

    private static void mulof2D(int[][] a, int r, int c, int[][] b, int r1, int c1) {

        if(c != r1){
            System.out.println("invalid input");
            return;
        }

        int mul[][]=new int[r][c1];

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c1 ; j++) {
                for (int k = 0; k < c; k++) {
                    mul[i][j]+=(a[i][k]*b[k][j]);

                }

            }

        }
        printarray(mul);

    }
}
