package collegedsa;

import java.util.ArrayList;
import java.util.Collections;

public class dictsmaller {

    public static void main(String[] args) {
        String s = "cab";
        ArrayList<String> list = new ArrayList<>();
        dict(s, "", list);


        Collections.sort(list);

        //System.out.println(list);


        for (String l : list) {
            if (l.compareTo(s)<0){
                System.out.println(l);
            }

        }
    }

    private static void dict(String s, String ans, ArrayList<String> list) {
        if (ans.length() == 3) {
            list.add(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String restOfString = s.substring(0, i) + s.substring(i + 1);
            dict(restOfString, ans + ch, list);
        }
    }
}
