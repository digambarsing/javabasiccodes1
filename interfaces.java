package abstraction;

public interface interfaces {

    void add();

    void  sub();

    // all methods are by default are abstract

    void div();

    void add(int a,int b, int c);

    void add(int a,int b);


    private void def(){
        System.out.println('a');
        // this cannot access in other class because it is a private method
    }


}
