package collegedsa;

public class paranthesesgenrate {
    static void paragenerate(int n,String ans,int start,int closed){
        if (start==n && closed==n){
            System.out.println(ans);
            return;
        }
        if (start<n){
            paragenerate(n,ans+"(",start+1,closed);
        }
        if (closed<start){
            paragenerate(n,ans+")",start,closed+1);
        }
    }
    public static void main(String[] args) {
        int n=3;
        paragenerate(n,"",0,0);
    }
}
