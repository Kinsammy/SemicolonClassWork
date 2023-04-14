package semicolonClassWork.levelOne;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number or -1 to see result: ");
        int number = input.nextInt();
        int firstLargest = 0;
        int secondLargest = 0;

        while(number != -1){
            if(number >  firstLargest){
                number =  firstLargest;
            }
            if (firstLargest > number){
                number = secondLargest;
            }

            System.out.println("Enter a numbers");
            number = input.nextInt();
        }

        System.out.printf("first largest %d%nand second largest %s", firstLargest, secondLargest);
    }
}
