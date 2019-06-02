package week5;

import java.util.Scanner;

public class FibonacciFinder {

    public void findNthFibonacci(int n) {
        int f1 = 1;
        int f2 = 1;
        int f3 = f1 + f2;

        if (n == 1) {
            System.out.println(f1);
        }
        if (n == 2) {
            System.out.println(f2);
        }
        if (n == 3) {
            System.out.println(f3);
        }

        int counter = 3;
        while (counter <= n) {
            f1 = f2 + f3;
            counter++;
            if (counter == n) {
                System.out.println(f1);
            }

            f2 = f1 + f3;
            counter++;
            if (counter == n) {
                System.out.println(f2);
            }

            f3 = f1 + f2;
            counter++;
            if (counter == n) {
                System.out.println(f3);
            }
        }

    }

    public static void main(String[] args) {
        FibonacciFinder fibonacciFinder = new FibonacciFinder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which fibonacci you want to calculate? : ");
        int n = scanner.nextInt();

        fibonacciFinder.findNthFibonacci(n);
    }
}
