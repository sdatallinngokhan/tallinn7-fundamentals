// Write a program to check a word is palindrome or not

package week5;

public class Palindrome {

    public boolean isPalindrome(String word) {
        String reversedWord = "";
        char[] wordArray = word.toCharArray();
        for (int i = wordArray.length - 1; i >= 0; i--) {
            reversedWord += wordArray[i];
        }

        if (word.equalsIgnoreCase(reversedWord)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        String word = "Anna";
        boolean result = palindrome.isPalindrome(word);

        System.out.println(word + " is palindrome? " + result);
    }
}
