package stacks;

import java.util.*;

public class ReverseString {
    public static void reverseString(char[] s) {
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (char c : s) {
            stack.push(c);
        }

        // Pop characters from the stack and overwrite the original array
        for (int i = 0; i < s.length; i++) {
            s[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        char[] example1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(example1);
        System.out.println("Reversed Example 1: " + Arrays.toString(example1));

        char[] example2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(example2);
        System.out.println("Reversed Example 2: " + Arrays.toString(example2));
    }
}

