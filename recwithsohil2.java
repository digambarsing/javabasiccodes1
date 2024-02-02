package collegedsa;

public class recwithsohil2 {

    static void stringpermutation(String s,String ans){

        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);

            String ros = s.substring(0, i) +
                    s.substring(i + 1);


            stringpermutation(ros, ans + ch);
            
        }
        
    }

    static void permutation1(String s,String ans){

        if(ans.length()==3){
            System.out.println(ans);
            return;
        }

        for (int i = 0; i <s.length() ; i++) {
            permutation1(s.substring(0,i)+s.substring(i+1),ans+s.charAt(i));

        }

    }
    public static void main(String[] args) {
        String s="abc";
       // stringpermutation(s," ");
        permutation1(s,"");
    }
}
