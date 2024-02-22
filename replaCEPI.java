package collegedsa;

import java.util.Scanner;

public class replaCEPI {
    public static void main(String[] args) {
        int n=3;
        for (int i = 0; i < 3; i++) {
            Scanner sc=new Scanner(System.in);
            String s= sc.nextLine();
            System.out.println(print(s));

        }
    }

    private static String print(String s) {
        if (!s.contains("pi")){
            return (s);
        }

        int i=s.indexOf("pi");
        String ms= print(s.substring(0,i)+"3.14"+s.substring(i+2));
        return print(ms);
    }
}
