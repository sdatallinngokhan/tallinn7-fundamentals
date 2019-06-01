package week5;

public class ArraySorter {

    public void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }

    public static void main(String[] args) {
        ArraySorter arraySorter = new ArraySorter();

        int[] arr = {3, 2, 8, 5, 10};
        arraySorter.sortArray(arr);

        // RESULT : 2, 3, 5, 8, 10
    }

}
