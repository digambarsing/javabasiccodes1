package binarysys;

public class clear {
    public static void main(String[] args) {
        int n=10;
        int i=1;

        int b=~(1<<i);

        System.out.println((n&b));
    }
}
