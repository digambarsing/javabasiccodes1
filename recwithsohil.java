package collegedsa;

public class recwithsohil {

    //coin tosses n times




    static void cointoss(int n,String ans ){
        // base case
        if (n==0){
            System.out.println(ans);
            return ;
        }

        cointoss(n-1,ans+"H");
        cointoss(n-1,ans+"T");



    }
    public static void main(String[] args) {
        int n=3;
        cointoss(n," ");


    }
}
