package stringbuilder_basic;

public class strbuilderfun {
    public static void main(String[] args) {


        StringBuilder n=new StringBuilder("hello");
        System.out.println(n);


        n.append("world");
        System.out.println(n);


        n.setCharAt(0,'m');
        System.out.println(n);


        n.insert(1,"buffalo");
        System.out.println(n);



        n.indexOf("m");
        System.out.println(n);


        n.deleteCharAt(0);
        System.out.println(n);


        n.reverse();
        System.out.println(n);

        n.delete(0,4);
        System.out.println(n);


        n.replace(0,4,"true");
        System.out.println(n);
    }
}
