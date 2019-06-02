//-Find longest word from a given sentence
//Take input from user
//
//My surname is Pod.
//
//result : surname

package week5;

import java.util.Scanner;

public class LongestWord {

    public void findLongestWord(String word) {
        String[] splittedWord = word.split(" ");

        String longestWord = splittedWord[0];
        for (int i = 0; i < splittedWord.length; i++) {
            if (splittedWord[i].length() > longestWord.length()) {
                longestWord = splittedWord[i];
            }
        }

        System.out.println("Longest word is : " + longestWord);
    }

    public static void main(String[] args) {
        LongestWord abc = new LongestWord();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your word : ");
        String word = scanner.nextLine();

        abc.findLongestWord(word);
    }
}
