package stringbasic;

public class substrself {
    static String sub(String s,int st,int e){
        String sub="";
        for (int i = st; i < e; i++) {
            sub=sub+s.charAt(i);

        }
        return sub;

    }
    public static void main(String[] args) {
        String s="hello";
        System.out.println(sub(s,0,4));
        System.out.println(s.substring(0,4));


    }
}
