package javaoops;

public class constcopy {
    public static void main(String[] args) {
        student s=new student();
        s.name="ved";
        s.age=12;
        s.marks[0]=34;
        s.marks[1]=54;
        s.marks[2]=44;


        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.marks[0]);
        System.out.println(s.marks[1]);
        System.out.println(s.marks[2]);





    }
}

class student{
    String name;

    int age;

    int []marks=new int[3];
    student(){

    }
    student(student s){
        this.name=s.name;
        this.age=s.age;
        this.marks=s.marks;

    }

}
