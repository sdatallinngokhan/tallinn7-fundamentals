package week5;

import java.util.HashSet;
import java.util.Set;

public class DuplicatedNumbers {

    public void findDuplicatedElements(int[] arr) {
        Set<Integer> duplicatedNumbersSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicatedNumbersSet.add(arr[i]);
                }
            }
        }

        System.out.println(duplicatedNumbersSet);
    }

    public static void main(String[] args) {
        DuplicatedNumbers duplicatedNumbers = new DuplicatedNumbers();

        int[] arr = {3, 5, 9, 3, 6, 1, 5, 3, 8, 6, 9, 0, 4, 5, 7};
        duplicatedNumbers.findDuplicatedElements(arr);
    }
}
