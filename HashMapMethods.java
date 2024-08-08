package HashMap;

import java.util.HashMap;

public class HashMapMethods {


    public static void main(String[] args) {
        methods();
    }

    public static void methods() {
        HashMap<Integer,String> hp=new HashMap<>();

        hp.put(1,"ved");
        hp.put(2,"dev");
        hp.put(3,"red");
        hp.put(4,"ged");
        hp.put(5,"ced");
        hp.put(6,"ned");
        hp.put(7,"ped");
        hp.put(8,"qed");

        System.out.println(hp);


        System.out.println(hp.get(1));
        System.out.println(hp.get(2));
        System.out.println(hp.get(9));


        System.out.println(hp.containsKey(1));
        System.out.println(hp.containsKey(9));


        System.out.println(hp.containsValue("ved"));
        System.out.println(hp.containsValue("aed"));


        hp.putIfAbsent(1,"radha");
        hp.putIfAbsent(9,"radha");

        System.out.println(hp);

        hp.put(1,"radha");
        System.out.println(hp);

        hp.remove(1);
        hp.remove(5);
        System.out.println(  hp.remove(10));

        System.out.println(hp);



        hp.clear();
        System.out.println(hp);


        hp.putIfAbsent(1,"radha");
        hp.putIfAbsent(9,"radha");

        System.out.println(hp);

        System.out.println(hp.keySet());
        System.out.println(hp.values());
        System.out.println(hp.entrySet());


        for (Integer key : hp.keySet()) {
            System.out.printf("The key is: %d , %s ", key,hp.get(key));
        }



    }
}
