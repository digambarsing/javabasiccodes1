package sorting;

import java.util.*;

public class mergetwsortarray {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // If any elements remaining in arr1, append them
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // If any elements remaining in arr2, append them
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] merged = mergeSortedArrays(arr1, arr2);

        System.out.println("Merged Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}

