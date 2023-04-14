package semicolonClassWork.levelTwo;

import java.util.Arrays;

public class ProductList {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

        products(numbers);
    }

    private static void products(int[] numbers){

        for (int index= 0; index < numbers.length; index++){
            if (numbers[index] == numbers[index]){
                numbers[index] *= numbers[index];
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
