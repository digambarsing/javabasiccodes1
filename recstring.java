package collegedsa;

public class recstring {

    static void subsubsequence( String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return ;
            // we add return because we call function many times

        }
        char c1=s.charAt(0);
        subsubsequence(s.substring(1),ans);

        subsubsequence(s.substring(1),ans+c1);


    }
    public static void main(String[] args) {
        // substring: continuous string part. it is a subset of subsequence.
        // subsequence: all parts of string.

        // a blank string is also a subsequence.

       // for subsequence string has 2 choices either come with or not come with .
        String s="abc";

        subsubsequence(s,"");
    }
}
