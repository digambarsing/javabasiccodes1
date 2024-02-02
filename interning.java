package stringbasic;

public class interning {
    public static void main(String[] args) {
        // interning
        String s="hello";
        String q="hello";
        String w="hello";
        String e="hello";
        System.out.println(s);
        System.out.println(q);
        System.out.println(e);
        System.out.println(w);
        // new
        String sc=new String("hello");
        String scq=new String("hello");
        String sce=new String("hello");
        String scr=new String("hello");


        System.out.println(sc);
        System.out.println(scq);

        System.out.println(sce);

        System.out.println(scr);



        // due to interning ,string is immutable
        // due to immutable,it has poor performance




    }
}
