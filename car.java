public class car {
    int no;
    String color;
    void insert(int nu,String colors){
        no = nu;
        color=colors;

    }
    void paste(){
        System.out.println(no +" "+ color);
    }


}
class dain{
    public static void main(String[] args) {
        car bmw=new car();
        bmw.insert(3,"red");
        bmw.paste();


    }
}
