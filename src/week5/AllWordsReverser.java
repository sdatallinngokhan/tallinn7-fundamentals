//-reverse all words of a given sentence, and then print
//Take Input from user
//
//Hello World
//Result : olleH dlroW

package week5;

import java.util.Scanner;

public class AllWordsReverser {

    public void reverseAllWords(String word) {
        String[] wordArray = word.split(" ");

        for (int i = 0; i < wordArray.length; i++) {
            System.out.print(reverseWord(wordArray[i]) + " ");
        }
    }

    private String reverseWord(String word) {
        char[] wordArray = word.toCharArray();

        String result = "";
        for (int i = wordArray.length - 1; i >= 0; i--) {
            result += String.valueOf(wordArray[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        AllWordsReverser allWordsReverser = new AllWordsReverser();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your word : ");
        String word = scanner.nextLine();
        allWordsReverser.reverseAllWords(word);
    }
}
