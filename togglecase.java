package stringbuilder_basic;

import java.util.Scanner;

public class togglecase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        StringBuilder c=new StringBuilder(sc.nextLine());

        for (int i = 0; i < c.length(); i++) {

            boolean capitalletter=true;

            char ch=c.charAt(i);

            if(ch==' '){
                continue;
            }

            int asc=(int)ch;

            if(asc>=97){
                capitalletter=false;
            }

            if (capitalletter==true){
                asc+=32;
                char chh=(char)asc;
                c.setCharAt(i,chh);
            }
            else{
                asc-=32;
                char chh=(char)asc;
                c.setCharAt(i,chh);

            }

        }
        System.out.println(c);
    }
}
