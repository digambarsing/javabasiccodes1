package Microsoft;

import java.util.Stack;

public class ValidStackSequence {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0;

        for (int num : popped) {
            // If stack is empty or top element is not equal to the current popped element,
            // keep pushing elements from the pushed array to the stack.
            while (stack.isEmpty() || stack.peek() != num) {
                if (pushIndex >= pushed.length) {
                    // If we've exhausted all elements in the pushed array.
                    return false;
                }
                stack.push(pushed[pushIndex++]);
            }

            // If the top element of the stack is equal to the current popped element,
            // pop it from the stack.
            stack.pop();
        }

        // If the stack is empty after processing all popped elements, return true.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed1 = {1, 2, 3, 4, 5};
        int[] popped1 = {4, 5, 3, 2, 1};
        System.out.println("Example 1 Output: " + validateStackSequences(pushed1, popped1));

        int[] pushed2 = {1, 2, 3, 4, 5};
        int[] popped2 = {4, 3, 5, 1, 2};
        System.out.println("Example 2 Output: " + validateStackSequences(pushed2, popped2));
    }
}

