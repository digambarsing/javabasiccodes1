public class creation {
    void fact(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        new creation().fact(5); // anonymous method of create an object and class and object name nust e same.
    }
}

