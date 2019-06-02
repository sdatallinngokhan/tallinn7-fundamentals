//-Write a Java program to return a new string using every characters of even positions from a given string.

package week5;

import java.util.Scanner;

public class EvenCharactersOfAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your word : ");
        String word = scanner.nextLine();

        char[] wordArray = word.toCharArray();

        for (int i = 0; i < wordArray.length; i++) {
            if (i % 2 == 0) {
                System.out.print(wordArray[i]);
            }
        }
    }
}
