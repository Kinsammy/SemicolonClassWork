package semicolonClassWork.levelTwo;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Example sorted arrays
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArr = mergeArrays(arr1, arr2);
        System.out.println(Arrays.toString(mergedArr));

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;


        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArr[k++] = arr1[i++];
            } else {
                mergedArr[k++] = arr2[j++];
            }
        }


        while (i < arr1.length) {
            mergedArr[k++] = arr1[i++];
        }


        while (j < arr2.length) {
            mergedArr[k++] = arr2[j++];
        }

        return mergedArr;
    }
}
