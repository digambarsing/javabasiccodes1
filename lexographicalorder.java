package collegedsa;

public class lexographicalorder {
    public static void main(String[] args) {
        int n=15;
        for (int i = 1; i <=9 ; i++) {
            print(n,i);
        }


    }

    private static void print(int n,int ans) {

        if (ans<=n){
            System.out.println(ans);
        }
        if(ans>n){
            return;
        }
        for (int i=0; i <=9 ; i++) {
           print(n,ans*10+i);
        }
    }
}
