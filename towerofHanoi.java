package recursion;

import java.util.Scanner;

public class towerofHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int n = sc.nextInt();

        moveDisks(n, "Source", "Helper", "Destination");
    }

    private static void moveDisks(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        moveDisks(n - 1, source, destination, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveDisks(n - 1, helper, source, destination);
    }
}

