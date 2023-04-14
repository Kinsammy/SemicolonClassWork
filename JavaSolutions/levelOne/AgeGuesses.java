package semicolonClassWork.levelOne;

import java.util.Scanner;

public class AgeGuesses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = 7;
        System.out.println("Guess my birth day");
        int guess = input.nextInt();


        while (true){
            if (guess == day){
                System.out.println("Correct guess");
                break;
            } else {
                System.out.println("Incorrect Guess");
                System.out.println("Guess my birth day");
                guess = input.nextInt();
            }
        }
    }
}
