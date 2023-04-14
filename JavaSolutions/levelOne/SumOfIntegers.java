package semicolonClassWork.levelOne;

public class SumOfIntegers {
    public static void main(String[] args) {
        int end = 30;
        int total = 0;

        for (int start = 1; start <= end; start++) {
            if (start % 3 == 0) {
                total += start;
            }
        }

        System.out.println("The sum of integers between 1 and 30 that are divisible by 3 is: " + total);
    }
}
