package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhp = new LinkedHashMap<>();
        lhp.put("ved",20);
        lhp.put("dev",23);
        lhp.put("ganesh",25);
        lhp.put("me",18);


        System.out.println(lhp);

        HashMap<String, Integer> hp = new HashMap<>();
        hp.put("ganesh",25);
        hp.put("me",18);
        hp.put("ved",20);
        hp.put("dev",23);



        System.out.println(hp);

    }
}
