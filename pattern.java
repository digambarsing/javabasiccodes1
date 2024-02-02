package sigma;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        // outer loop is used to print no. of rows
        // iner loop is used to work that happen in each row
        // than print what
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }
    }
}
