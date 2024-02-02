package oops;

public class basics { // class is a user defined data type.
    String name;
    int roll;
    int dob;
    public static void change(basics s){
        s.name="ram";
    }
}

class main{
    public static void main(String[] args) {
        basics n=new basics();
        n.name="Digambar singh";
        n.roll=26;
        n.dob=26052005;
        System.out.println(n.name);
        System.out.println(n.roll);
        System.out.println(n.dob);
        basics.change(n);
        System.out.println(n.name);

    }
}

