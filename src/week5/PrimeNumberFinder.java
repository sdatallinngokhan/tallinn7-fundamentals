// write a program to check a number is prime or not

package week5;

public class PrimeNumberFinder {

    public boolean isPrime(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        int number = 39;
        boolean prime = primeNumberFinder.isPrime(number);

        System.out.println(number + " is prime? " + prime);
    }

}
