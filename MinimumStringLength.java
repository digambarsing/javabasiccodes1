package stacks;

import java.util.Stack;

public class MinimumStringLength {

    public static int minStringLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == 'A' && c == 'B') {
                stack.pop(); // Remove 'A' from stack
                continue; // Skip adding 'B' to stack
            } else if (!stack.isEmpty() && stack.peek() == 'C' && c == 'D') {
                stack.pop(); // Remove 'C' from stack
                continue; // Skip adding 'D' to stack
            }
            stack.push(c);
        }

        return stack.size();
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "ABFCACDB";
        System.out.println("Output for '" + s1 + "': " + minStringLength(s1)); // Output: 2

        // Example 2
        String s2 = "ACBBD";
        System.out.println("Output for '" + s2 + "': " + minStringLength(s2)); // Output: 5
    }
}

