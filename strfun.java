package stringbasic;

public class strfun {
    public static void main(String[] args) {
        String q="hello";
        String w="raghav";
        String e="hello";
        String s=new String("hello");

        System.out.println(q.length());
        System.out.println(q.charAt(3));
        System.out.println(q.indexOf("e"));

        // compareto function check with ascii vale
        System.out.println(q.compareTo(w));
        System.out.println(q.compareTo(e));
        // == check with address
        System.out.println(q==w);
        System.out.println(s==q);
        System.out.println(q==e);


        // equals check with address and ascii vale both

        System.out.println(s.equals(e));

        System.out.println(q.contains("el"));
        System.out.println(q.contains("eo"));

        System.out.println(w.startsWith("ra"));

        System.out.println(w.endsWith("av"));

        System.out.println(q.toLowerCase());
        System.out.println(w.toUpperCase());

        System.out.println(q.concat(w));


        System.out.println(s+"fg");
        System.out.println(s+13);
        System.out.println(s+12+13);
        System.out.println(s+(10+30));



    }
}
