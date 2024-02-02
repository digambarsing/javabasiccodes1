package javaoops;

public class consimplemnt {
    public static void main(String[] args) {
        constructorbAsic sc=new constructorbAsic();
        sc.name="ved";
        sc.salary=45;

        System.out.println(sc.name);
        System.out.println(sc.salary);
        System.out.println(sc.course);



//        constructorbAsic s=new constructorbAsic("ved",45,"Flipkart");
//        System.out.println(s.name);
//        System.out.println(s.salary);
//        System.out.println(s.companyName);

        constructorbAsic f=new constructorbAsic("ram",46,"amazon");
        System.out.println(f.name);
        System.out.println(f.salary);
        System.out.println(f.companyName);


    }
}
