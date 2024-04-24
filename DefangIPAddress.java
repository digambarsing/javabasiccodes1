package Microsoft;

public class DefangIPAddress {
    public String defangIPaddr(String address) {
        // Use replace method to replace all occurrences of "." with "[.]"
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        DefangIPAddress solution = new DefangIPAddress();

        String address1 = "1.1.1.1";
        System.out.println("Output 1: " + solution.defangIPaddr(address1)); // Output: "1[.]1[.]1[.]1"

        String address2 = "255.100.50.0";
        System.out.println("Output 2: " + solution.defangIPaddr(address2)); // Output: "255[.]100[.]50[.]0"
    }
}

