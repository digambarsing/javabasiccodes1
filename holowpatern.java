package sigma;

import java.util.Scanner;

public class holowpatern {
    static void printpatrn(int row ,int col){
        for (int i=1;i<=row;i++){
            for (int j = 1; j <=col ; j++) {
                if (i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    static void printpatrns(int row ,int col){
        for (int i=1;i<=row;i++){
            for (int j = 1; j <=col ; j++) {
                if (i==1||i==row||j==1||j==col){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    static void stars(int n){
        for (int i = 0; i <n ; i++) {
            // spaces
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    static void numbers(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i+1; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
    }
    static void floydsnumbertriangle(int n){
        int counter=1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(counter+" ");
                counter++;

            }
            System.out.println();

        }
    }
    static void onesandzeros(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }

            }
            System.out.println();

        }
    }

    static void butterfly(int n){
        for (int i = 1; i <=n ; i++) {
            // stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            // spaces
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int j = n; j >=1 ; j--) {
            // stars
            for (int k = 1; k <=j ; k++) {
                System.out.print("*");

            }
            // spaces
            for (int k= 1; k <=2*(n-j) ; k++) {
                System.out.print(" ");

            }
            // stars
            for (int k = 1; k <=j ; k++) {
                System.out.print("*");

            }
            System.out.println();


        }

    }
    static void rhombus(int n){
        for (int i = 1; i <=n ; i++) {
            // space
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static void holoowrhombus(int n){
        for (int i = 1; i <=n ; i++) {
            // spaces
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=n ; j++) {
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
    static void diamond(int n){
        for (int i = 1; i <=n ; i++) {
            // spaces
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = n; i >=1 ; i--) {
            // spaces
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int n= sc.nextInt();
        // printpatrn(4,5);
        //printpatrns(4,5);
       // stars(n);
       // numbers(n);
        //floydsnumbertriangle(n);
       // onesandzeros(n);
       // butterfly(n);
       // rhombus(n);
        //holoowrhombus(n);
        diamond(n);
    }
}
