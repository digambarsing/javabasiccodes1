package stringbasic;

import java.util.Scanner;

public class TOgglecase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String c= sc.nextLine();
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
               c+=c.substring(0,i)+chh+c.substring(i+1);
            }
            else{
                asc-=32;
                char chh=(char)asc;
                c+=c.substring(0,i)+chh+c.substring(i+1);

            }

        }
        System.out.println(c);
    }
    }



