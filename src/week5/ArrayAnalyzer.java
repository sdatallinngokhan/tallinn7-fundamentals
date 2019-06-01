package week5;

public class ArrayAnalyzer {

    public int[] getSortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        ArrayAnalyzer arrayAnalyzer = new ArrayAnalyzer();

        int[] arr = {3, 2, 8, 5, 10, 6};
        int[] sortedArray = arrayAnalyzer.getSortedArray(arr);

        System.out.print("Sorted array : ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + ", ");
        }
        System.out.println();

        if (arr.length % 2 == 1) {
            System.out.println("Smallest element : " + arr[0]);
            System.out.println("Biggest element : " + arr[arr.length - 1]);
            System.out.println("Middle element : " + arr[arr.length / 2]);
        } else {
            System.out.println("Smallest element : " + arr[0]);
            System.out.println("Biggest element : " + arr[arr.length - 1]);
            System.out.println("First Middle element: " + arr[arr.length / 2]);
            System.out.println("second Middle element: " + arr[(arr.length / 2) - 1]);
        }
    }
}
