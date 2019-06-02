// find sum of prime numbers up to a given limit

package week5;

import java.util.Scanner;

public class SumOfPrimeNumbers {

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

    public int sumPrimes(int limit) {
        int sum = 0;
        for (int i = 2; i <= limit; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfPrimeNumbers sumOfPrimeNumbers = new SumOfPrimeNumbers();
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the limit? : ");
        int limit = scanner.nextInt();

        int result = sumOfPrimeNumbers.sumPrimes(limit);

        System.out.println("Result : " + result);
    }
}
