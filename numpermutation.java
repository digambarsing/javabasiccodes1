package recursion;

public class numpermutation {

    static int count=0;
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        int n=3;
        for (int i = 1; i <=n ; i++) {
            s.append(i);
        }
        perm(String.valueOf(s),"",1);
    }

    private static void perm(String s, String s1,int k) {
        if(s.length()==0){
            count++;
            if(count==k){
                System.out.println(s1);
            }

            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            perm(s.substring(0,i)+s.substring(i+1),s1+c,k);

        }
    }
}
