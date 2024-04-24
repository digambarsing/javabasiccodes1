package Microsoft;


public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Convert string to lowercase
        s = s.toLowerCase();

        // Initialize pointers for leftmost and rightmost characters
        int left = 0;
        int right = s.length() - 1;

        // Iterate until the pointers meet or cross
        while (left < right) {
            // Move the left pointer if it's not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move the right pointer if it's not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            // Compare characters from both ends
            if (s.charAt(left) != s.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            // Move pointers towards the center
            left++;
            right--;
        }

        return true; // If all characters match, it's a palindrome
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Output 1: " + solution.isPalindrome(s1)); // Output: true

        String s2 = "race a car";
        System.out.println("Output 2: " + solution.isPalindrome(s2)); // Output: false

        String s3 = " ";
        System.out.println("Output 3: " + solution.isPalindrome(s3)); // Output: true
    }
}

