package week4;

public class Calculator {

    // n1, n2 are parameters
    public void sum(int n1, int n2) {
        double result = n1 + n2;

        System.out.println("Sum operation result is : " + result);
    }

    public void subtract(int n1, int n2) {
        double result = n1 - n2;

        System.out.println("Subtract operation result is : " + result);
    }

    public void multiply(int n1, int n2) {
        double result = n1 * n2;

        System.out.println("Multiply operation result is : " + result);
    }

    public void divide(int n1, int n2) {
        double result = (double) n1 / n2;

        System.out.println("Division operation result is : " + result);
    }

    public void modularity(int n1, int n2) {
        double result = n1 % n2;

        System.out.println("Modularity operation result is : " + result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int number1 = 10;
        int number2 = 3;

        // number1, number2 are arguments
        calculator.sum(number1, number2);
        calculator.subtract(number1,number2);
        calculator.multiply(number1,number2);
        calculator.divide(number1,number2);
        calculator.modularity(number1,number2);
    }
}
