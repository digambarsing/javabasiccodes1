package javaoops;

public class animals1 {
    public static void main(String[] args) {
        animals s=new animals();
        s.name="cow";
        s.location="agra";
       // s.price=56; // we can not access it because it is a private variable.

        System.out.println(s.name);
        System.out.println(s.location);



        // to access price we use setter and getter function.
         s.setprice(56);

        s.getprice();


    }
}
