package collegedsa;

public class consecutivehead {
    static void cointoss(int n,String ans ){
        // base case
        if (n==0){
            for (int i = 0; i <ans.length()-1 ; i++) {
                if (ans.charAt(i)==ans.charAt(i+1)&& ans.charAt(i)=='H'){
                    return;
                }

            }
            System.out.println(ans);
            return ;
        }
         // if(ans.length()==0 || ans.charAt(ans.length()-1)=='H')
        cointoss(n-1,ans+"H");
        cointoss(n-1,ans+"T");



    }
    public static void main(String[] args) {
        int n=3;
        cointoss(n," ");
    }
}
