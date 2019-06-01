package week5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public static void main(String[] args) {
        JavaCollections javaCollections = new JavaCollections();

        javaCollections.learnList();
        javaCollections.learnSet();
    }
}
