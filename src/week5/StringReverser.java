package week5;

public class StringReverser {

    public void reverseName(String name) {
        char[] nameArray = name.toCharArray();

        for (int i = nameArray.length-1; i>=0; i--) {
            System.out.print(nameArray[i]);
        }
    }

    public static void main(String[] args) {
        StringReverser stringReverser = new StringReverser();

        String name = "Gokhan";
        stringReverser.reverseName(name);
    }
}
