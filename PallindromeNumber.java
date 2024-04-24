package Microsoft;

public class PallindromeNumber {
    public static boolean isPalindrome(int x) {
        // Convert integer to string
        String str = String.valueOf(x);

        // Initialize pointers for leftmost and rightmost characters
        int left = 0;
        int right = str.length() - 1;

        // Iterate until the pointers meet or cross
        while (left < right) {
            // Compare characters from both ends
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            // Move pointers towards the center
            left++;
            right--;
        }

        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
       // PalindromeNumber solution = new PalindromeNumber();

        int x1 = 121;
        System.out.println("Output 1: " + isPalindrome(x1)); // Output: true

        int x2 = -121;
        System.out.println("Output 2: " + isPalindrome(x2)); // Output: false

        int x3 = 10;
        System.out.println("Output 3: " + isPalindrome(x3)); // Output: false
    }
}

