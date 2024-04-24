package Microsoft;

public class SignOfProductOfArray {
    public int arraySign(int[] nums) {
        int product = 1;

        for (int num : nums) {
            if (num == 0) {
                return 0; // If any element is zero, the product will be zero
            } else if (num < 0) {
                product *= -1; // If the element is negative, change the sign of the product
            }
        }

        return product > 0 ? 1 : -1; // Return the sign of the product
    }

    public static void main(String[] args) {
        SignOfProductOfArray solution = new SignOfProductOfArray();

        int[] nums1 = {-1, -2, -3, -4, 3, 2, 1};
        System.out.println("Output 1: " + solution.arraySign(nums1)); // Output: 1

        int[] nums2 = {1, 5, 0, 2, -3};
        System.out.println("Output 2: " + solution.arraySign(nums2)); // Output: 0

        int[] nums3 = {-1, 1, -1, 1, -1};
        System.out.println("Output 3: " + solution.arraySign(nums3)); // Output: -1
    }
}

