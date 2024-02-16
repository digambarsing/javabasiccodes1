package collegebacktracking;

public class subsets3 {
    public static void main(String[] args) {
        String s="abc";
        substring(s,"",0);
    }

    private static void substring(String s, String ans,int i) {
        if(i==s.length()){
            System.out.println(ans);
            return;
        }

        substring(s,ans+s.charAt(i),i+1);
        substring(s,ans,i+1);
    }
}
