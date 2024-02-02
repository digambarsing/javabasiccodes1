package javaoops;

public class classbasics {
    // creation of a class(user defined datatype)

   static class car{
        String name;
        int price;


    }

    static void change(car s){
       // class is pass by reference not a value.
       s.name="alto";
    }
    public static void main(String[] args) {



       // create a class

        class student{
            static String Name;
            static int age;
        }


        // object of student class.

        student.Name="ved";
        student.age=56;


        System.out.println(student.Name);
        System.out.println(student.age);
        // object creation of class car.

        car c1=new car();
        c1.name="odii";
        c1.price= Integer.parseInt("23000000");

        System.out.println(c1.name);
        System.out.println(c1.price);



        car c2=new car();
        c2.name="odii";
        c2.price= 23;

        change(c2);
        System.out.println(c2.name);
        System.out.println(c2.price);


        // if we create a class inside the main function than we can not access it outside the main function or can not pass it into a function.

    }
}
