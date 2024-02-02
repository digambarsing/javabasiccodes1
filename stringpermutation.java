package collegedsa;

public class stringpermutation {
    static void permutation(String s,String ans){
        if(ans.length()==3){
            System.out.println(ans);
            return;
        }


        for (int i = 0; i < s.length(); i++) {

            boolean flag=false;
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i)==s.charAt(j)){
                    flag=true;

                }

            }
            if (flag==false)
            permutation(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));

        }

    }
    public static void main(String[] args) {
        String s="aba";
        permutation(s,"");

    }
}
