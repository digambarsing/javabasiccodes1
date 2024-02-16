package collegedsa;

import java.util.Scanner;

public class Main {

    // Function to replace all occurrences of '0' with '5' using recursion
    public static int replaceZerosWithFives(int N) {
        // Base case: if the number becomes zero, return 0
        if (N == 0) {
            return 0;
        }

        // Extract the last digit of the number
        int lastDigit = N % 10;

        // Recursively call the function for the remaining number
        int remainingNumber = replaceZerosWithFives(N / 10);

        // If the last digit is 0, replace it with 5, otherwise keep it as it is
        if (lastDigit == 0) {
            return remainingNumber * 10 + 5;
        } else {
            return remainingNumber * 10 + lastDigit;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input integer N
        int N = scanner.nextInt();

        // Output the result
        System.out.println(replaceZerosWithFives(N));

        scanner.close();
    }
}

