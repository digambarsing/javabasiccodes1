package stringbasic;

public class largestr {
    public static void main(String[] args) {
        String []s={"banan","mango","apple","papaya","kiwi"};
        String largest=s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i].compareToIgnoreCase(largest) >0){
                largest=s[i];
            }

        }
        System.out.println(largest);
    }
}
