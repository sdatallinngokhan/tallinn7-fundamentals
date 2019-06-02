//compare 2 array and find common elements

package week5;

public class ArrayComparison {

    public void compare(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + ", ");
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayComparison arrayComparison = new ArrayComparison();

        int[] arr1 = {3, 2, 8, 5, 10};
        int[] arr2 = {9, 20, 18, 5, 17, 3};
        arrayComparison.compare(arr1, arr2);
    }
}
