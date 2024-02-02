package control_statements;

import java.util.Scanner;

class LumberjackMirko {

    public static int woodCutting(int[] heights, int M) {
        int left = 1;
        int right = getMax(heights);

        while (left <= right) {
            int mid = (left + right) / 2;
            int totalWood = 0;

            for (int height : heights) {
                if (height > mid) {
                    totalWood += height - mid;
                }
            }

            if (totalWood >= M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return right;
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] heights = new int[N];
        for (int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }

        int result = woodCutting(heights, M);
        System.out.println(result);

        sc.close();
    }
}

