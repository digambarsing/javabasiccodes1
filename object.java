public class object {
    int age;
    String name;

}
//object intialize by reference variable
class main{
    public static void main(String[] args) {
        object obj =new object();
        obj.age=7;
        obj.name="dev";
        System.out.println(obj.name);
        System.out.println(obj.age);
    }
}
class rain{
public static void main(String[] args) {
        object obj1 =new object();

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        }
        }
