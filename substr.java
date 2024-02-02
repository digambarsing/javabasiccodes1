package stringbasic;

public class substr {
    public static void main(String[] args) {
        String s="abcd";
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(2));


        for (int i = 0; i <=3 ; i++) {
            for (int j = i+1; j <=4 ; j++) {
                System.out.println(s.substring(i,j));

            }

        }
    }
}
