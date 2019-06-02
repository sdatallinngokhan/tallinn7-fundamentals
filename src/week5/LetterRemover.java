//delete first and last letters of words from a given string and print them
//Take input from user
//
//Hello World
//RESULT : ell orl

package week5;

import java.util.Scanner;

public class LetterRemover {

    public void deleteFirstAndLastLetter(String word) {
        String[] wordArray = word.split(" ");
        for (int i = 0; i < wordArray.length; i++) {
            char[] wordPiece = wordArray[i].toCharArray();

            for (int j = 0; j < wordPiece.length; j++) {
                if (j == 0 || j == wordPiece.length - 1) {
                    continue;
                }
                System.out.print(wordPiece[j]);
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        LetterRemover letterRemover = new LetterRemover();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your word : ");
        String word = scanner.nextLine();
        letterRemover.deleteFirstAndLastLetter(word);
    }
}
