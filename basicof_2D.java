package array_2D;

import java.util.Scanner;

public class basicof_2D {

    static void printarray(int[][]ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j]+" ");

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {


        // outer loop and bracket  represent rows
        // inner loop and bracket  represent col


        // rows input is mandatory
        // col is not mandatory


        int[][]arr=new int[2][2];

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]= sc.nextInt();

            }

        }

        printarray(arr);


        int [][]a={{1,2},{3,4}};
        printarray(a);


    }
}
