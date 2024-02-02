package javaoops;

public class constructorbAsic {
    // it is all about a constructor.


    String name;


    int salary;


    String companyName;



    final String course="BCA";
    // final is used to make it constant now can not change its value.



    // static keyword.

   static int count=0;


    // it is a default constructor.
    public constructorbAsic(){
        count++;
        System.out.println(count);

    }


//    public constructorbAsic(String naam,int sal,String company){
//        name=naam;
//        salary=sal;
//        companyName=company;
//
//    }

    public constructorbAsic(String name,int salary,String companyName){
       this.name=name;
       this.salary=salary;
        this.companyName=companyName;
        count++;
        System.out.println(count);

    }


}
