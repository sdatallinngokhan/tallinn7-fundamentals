package week5;

public class ForEachLoop {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        for (int element : arr) {
            System.out.println(element);
        }
    }
}
