package collegedsa;

public class stringduplicate {
    static void printnonduplicate(String s,int index,StringBuilder newstr,boolean[]arr){
        if (index==s.length()){
            System.out.println(newstr);
            return;
        }

        char currentchar=s.charAt(index);
        if (arr[currentchar-'a']==true){
            printnonduplicate(s,index+1,newstr,arr);
        }else {
            arr[currentchar-'a']=true;
            printnonduplicate(s,index+1,newstr.append(currentchar),arr);

        }
    }
    public static void main(String[] args) {
        String s ="apnnacollege";
        boolean[]ar=new boolean[26];
        StringBuilder s1=new StringBuilder(" ");
        printnonduplicate(s,0, s1,ar);


    }
}
