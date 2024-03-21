package recursion;

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();

        printRev(s,s.length()-1);
    }

    private static void printRev(String s, int i) {
        if(i==0){
            System.out.print(s.charAt(i));
            return;
        }

        System.out.print(s.charAt(i));
        printRev(s,i-1);
    }
}
