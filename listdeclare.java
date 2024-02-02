package arraylist;

import java.util.ArrayList;

public class listdeclare {
    public static void main(String[] args) {

        // array list is used to make a dynamic size array


        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Float> l2=new ArrayList<>();
        ArrayList<Double> l3=new ArrayList<>();


        // add element

        l1.add(3);
        l1.add(34);
        l1.add(32);


        l1.add(0,54);


        // get element

        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));



        // print

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));

        }


        System.out.println(l1); // print as a list



        // modify element

        l1.set(2,87);
        System.out.println(l1);


        // remove an elemnt

        l1.remove(Integer.valueOf(3));
        System.out.println(l1);



        // methods : contains

        // arraylist can hold different datatype.



        ArrayList l=new ArrayList<>();

        l.add(2);
        l.add("hello");
        l.add('c');
        l.add(2.4);

        System.out.println(l);



    }
}
