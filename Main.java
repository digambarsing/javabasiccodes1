import java.util.Scanner;
//class airht{
//
//    airht(){
//        System.out.println("constructor of airht class non parameterised con.");
//    }
//    int add(int a,int b){
//        int ans= a+b;
//        return ans;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        airht scc =new airht();
//        Scanner sc = new Scanner(System.in);
//        int x= sc.nextInt();
//        int y= sc.nextInt();
//        int ans = scc.add(x,y);
//        System.out.println(ans);
//
//    }
//}

class airht{
    int a;
    int b;

    airht(int x, int y){
        System.out.println("constructor of airht class ");
        a=x;
        b=y;
    }
    int add(){
        int ans= a+b;
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        airht scc =new airht(5,7);
        Scanner sc = new Scanner(System.in);
//        int x= sc.nextInt();
//        int y= sc.nextInt();
        int ans = scc.add();
        System.out.println(ans);

    }
}