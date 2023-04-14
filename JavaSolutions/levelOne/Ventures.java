package semicolonClassWork.levelOne;

public class Ventures {
    public static void main(String[] args) {
        String word = "VENTURES";

        for (int index = 0; index < word.length(); index++){
            System.out.print(word.charAt(index));
            if (index + 1 < word.length()) {
                System.out.print(word.charAt(index + 1));
            }
            System.out.println();
        }

    }
}
