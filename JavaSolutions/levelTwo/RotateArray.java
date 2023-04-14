package semicolonClassWork.levelTwo;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        rotateArray(numbers);
    }

    private static void rotateArray(int[] arr){
        int lastIndex = arr.length-1;
        for (int firstIndex = 0; firstIndex < lastIndex; firstIndex++){
            for (int secondIndex = 0; secondIndex < arr.length; secondIndex++){
                  int temp = arr[firstIndex];
                  arr[firstIndex] = arr[lastIndex];
                  arr[lastIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
