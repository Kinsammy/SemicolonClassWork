package semicolonClassWork.levelOne;

public class Mississippi {
    public static void main(String[] args) {

        String word = "Mississippi";
        int iCount = 0;
        int sCount = 0;
        for (int index = 0; index < word.length(); index++){
          char letter = word.charAt(index);
          if (letter == 'i'){
              iCount++;
          }
          if (letter == 's'){
              sCount ++;
          }
        }
        System.out.printf("i occur %s times%n", iCount);
        System.out.printf("s occur %s times", sCount);
    }
}
