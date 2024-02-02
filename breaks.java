package sigma;

import java.util.Scanner;

public class breaks {
    static int m;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
             m= sc.nextInt();
            if(m%10==0){
                break;
            }
            System.out.println(m);

        }


    }
}
