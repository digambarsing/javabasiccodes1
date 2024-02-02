package collegedsa;

public class coinchange {
    static int k=Integer.MAX_VALUE;
    public static void main(String[] args) {
        int []ar={1,2,5};
        int amount=11;
        change(ar,amount,"");
        System.out.println(k);

    }

    private static void change(int[] ar, int amount, String s) {

        if(amount==0){
            if(s.length()<k){
                k=s.length();
            }
            //System.out.println(s);
            return;
        }

        if(amount<0){
            return;
        }
        for (int i = 0; i < ar.length; i++) {

            change(ar,amount-ar[i],s+ar[i]);
        }
    }
}
