package HashMap;

public class HashingExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hllo";

        int hashCode1 = str1.hashCode();
        int hashCode2 = str2.hashCode();

        System.out.println("Hash code of str1: " + hashCode1);
        System.out.println("Hash code of str2: " + hashCode2);

        // Check if the hash codes are equal
        if (hashCode1 == hashCode2) {
            System.out.println("The hash codes are equal!");
        } else {
            System.out.println("The hash codes are not equal!");
        }
    }
}
