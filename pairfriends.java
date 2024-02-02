package collegedsa;

public class pairfriends {
    public static void main(String[] args) {
        int n=3;
        System.out.println(pair(n));
    }

    private static int pair(int n) {
        if(n==1 || n==2){
            return n;
        }
        int single=pair(n-1);
        int pairfriend=pair(n-2)*(n-1);
        return single+pairfriend;
    }
}
