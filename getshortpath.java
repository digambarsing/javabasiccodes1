package stringbasic;

import java.util.Scanner;

public class getshortpath {
    static float getpath(String s){
        int x=0,y=0;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            // south
            if(c=='S'){
                x--;
            } else if (c=='N') {
                x++;

            } else if (c=='W') {
                y--;

            }else {
                y++;
            }

        }
        int x2=x*x;
        int y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println( getpath(s));
    }
}
