package week5;

public class JavaString {

    public static void main(String[] args) {
        String name = "Jack London";
        System.out.println("Substring 0-6 : " + name.substring(0, 6));

        char[] nameArray = name.toCharArray();
        System.out.println();
        System.out.println("Printing letters one by one");
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i]);
        }

        System.out.println();
        System.out.println("Char at 8. index : " + name.charAt(8));

        System.out.println();
        System.out.println("Length of name is : " + name.length());

        System.out.println();
        System.out.println("Lowercase of name : " + name.toLowerCase());

        System.out.println();
        System.out.println("Uppercase of name : " + name.toUpperCase());

        String[] splittedName = name.split(" ");
        System.out.println();
        System.out.println("Splitted Name");
        for (int i = 0; i < splittedName.length; i++) {
            System.out.println(splittedName[i]);
        }

        String replacedName = name.replaceAll("n", "T");
        System.out.println();
        System.out.println(replacedName);
    }
}
