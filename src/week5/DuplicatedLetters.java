//-Find duplicated letters from a given string
//Take input from user
//
//Hello
//
//Result : l

package week5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicatedLetters {

    public void findDuplicatedLetters(String word) {
        char[] wordArray = word.toCharArray();

        Set<Character> duplicatedCharactersSet = new HashSet<>();
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = i + 1; j < wordArray.length; j++) {
                if (wordArray[i] == wordArray[j]) {
                    duplicatedCharactersSet.add(wordArray[i]);
                }
            }
        }

        System.out.println(duplicatedCharactersSet);
    }

    public static void main(String[] args) {
        DuplicatedLetters duplicatedLetters = new DuplicatedLetters();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Your word : ");
        String word = scanner.nextLine();

        duplicatedLetters.findDuplicatedLetters(word);
    }
}
