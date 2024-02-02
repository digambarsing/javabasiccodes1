package self;

import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
        int account_number;
        String customer_name;
        Scanner sc=new Scanner(System.in);
        account_number= sc.nextInt();
        customer_name= sc.nextLine();

        System.out.println(account_number);
        System.out.println(customer_name);


    }
}
