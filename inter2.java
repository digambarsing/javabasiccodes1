package abstraction;

public class inter2  implements interfaces , inter1  {

    @Override
    public void add() {

        System.out.println("add");

    }

    @Override
    public void sub() {

        System.out.println("sub");

    }

    @Override
    public void div() {
        System.out.println("div");

    }

    @Override
    public void add(int a, int b) {
        System.out.println("add a and b");

    }

    @Override
    public void add(int a, int b, int c) {

        System.out.println(" add a b and c");

    }

    public static void main(String[] args) {

    }
}
