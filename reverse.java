package arraylist;

import java.util.ArrayList;

public class reverse {

    static void reversewitharraylist(ArrayList<Integer> p){
        int i=0;
        int j= p.size()-1;
        while(i<j){
            Integer t=Integer.valueOf(p.get(i));
            p.set(i,p.get(j));
            p.set(j,t);

            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();

        l.add(2);
        l.add(23);
        l.add(26);
        l.add(72);
        l.add(92);

        System.out.println(l);
        reversewitharraylist(l);
        System.out.println(l);


    }
}
