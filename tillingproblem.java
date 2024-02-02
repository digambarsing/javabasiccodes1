package collegedsa;

public class tillingproblem {
    public static void main(String[] args) {
        int n=3;
        System.out.println(  tilecount(n));
    }

    private static int tilecount(int n) {

        if(n==0||n==1){
            return 1;
        }

        int vert=tilecount(n-1);
        int horz=tilecount(n-2);
        return vert+horz;
    }
}
