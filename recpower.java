package collegedsa;

public class recpower {
    static int power(int n,int r){
        if(r==0){
            return 1;
        }
        return n*power(n,r-1);
    }

    public static void main(String[] args) {

        System.out.println(power(3,2));
    }
}
