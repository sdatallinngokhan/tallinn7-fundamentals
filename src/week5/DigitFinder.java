package week5;

import java.util.Scanner;

public class DigitFinder {

    public void findDigits(String word) {
        char[] wordArray = word.toCharArray();
        int sum = 0;
        for (int i = 0; i< wordArray.length; i++) {
            if (Character.isDigit(wordArray[i])) {
                sum = sum + Character.getNumericValue(wordArray[i]);
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitFinder digitFinder = new DigitFinder();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your word : ");
        String word = scanner.nextLine();

        digitFinder.findDigits(word);
    }
}
