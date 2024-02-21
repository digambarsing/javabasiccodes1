package collegebacktracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class intstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<String> list=new ArrayList<>();
        ArrayList<ArrayList<String>> ans=new ArrayList<>();
        print(n,"",list,ans);
        System.out.println(list);

//        Collections.sort(list);
//        for (String s:list) {
//            System.out.println(s);
//
//        }
    }

    private static void print(int n, String s, ArrayList<String> list,ArrayList<ArrayList<String>> ans) {

        if(n==0){
            list.add(s);
            ans.add(new ArrayList<String>(list));
            return;
        }

        if(n%10!=0){
            char c=(char)('a'+n%10-1);
            print(n/10,c+s,list,ans);
        }

        if(n>10 &&  n%100<=26){
            char c=(char)('a'+n%100-1);
            print(n/100,c+s,list,ans);
        }
    }
}
