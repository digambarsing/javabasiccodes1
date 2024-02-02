package abstraction;

public class abs2 extends abstracts {

    @Override
    void sub() {

        System.out.println("SUB");

    }

    public static void main(String[] args) {

        abstracts t= new abs2();

        t.add();
        t.sub();
    }
}
