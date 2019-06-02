package week5;

import java.util.*;

public class JavaCollections {

    public void learnList() {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(5);
        numberList.add(3);
        numberList.add(3);
        numberList.add(8);
        System.out.println("List : " + numberList);

        numberList.remove(2);
        System.out.println("List : " + numberList);

        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }
    }

    public void learnSet() {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(5);
        numberSet.add(11);
        numberSet.add(3);
        numberSet.add(3);
        numberSet.add(3);
        numberSet.add(3);
        numberSet.add(3);
        numberSet.add(8);
        System.out.println("Set : " + numberSet);
    }

    public void learnMap() {
        Map<String, Integer> lettersMap = new HashMap<>();

        lettersMap.put("H", 1);
        lettersMap.put("e", 1);
        lettersMap.put("l", 3);
        lettersMap.put("o", 2);

        for (String letter : lettersMap.keySet()) {
            System.out.println(lettersMap.get(letter));
        }
    }

    public static void main(String[] args) {
        JavaCollections javaCollections = new JavaCollections();

        javaCollections.learnList();
        javaCollections.learnSet();
    }
}
