package array_2D;

import java.util.Scanner;

public class spiral {

    static void printarray(int[][]ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");

            }
            System.out.println();

        }
    }

    static void spiaralarray(int[][]a,int r,int c){

        int toprow=0,bottomrow=r-1,leftcol=0,rightcol=c-1;
        int total=0;
        while (total<25){
            // toprow

            for (int i = leftcol; i <=rightcol && total<25 ; i++) {
                System.out.print(a[toprow][i] +" ");
                total++;
            }
            toprow++;

            // rightcol

            for (int i = toprow; i <=bottomrow  && total<25 ; i++) {
                System.out.print(a[i][rightcol] +" ");
                total++;
            }
            rightcol--;
            //bottomrow

            for (int i = rightcol; i >=leftcol  && total<25 ; i--) {
                System.out.print(a[bottomrow][i]+" ");
                total++;
            }
            bottomrow--;

            // leftcol

            for (int i = bottomrow; i >=toprow  && total<25 ; i--) {
                System.out.print(a[i][leftcol]+" ");
                total++;
            }
            leftcol++;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]ar=new int[5][5];


        System.out.println("enter element");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5; j++) {
                ar[i][j]= sc.nextInt();

            }

        }


        spiaralarray(ar,5,5);
    }
}
