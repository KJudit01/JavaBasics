import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSum(10, 20));
        System.out.println(getSubtraction(200, 150));
        System.out.println(getMultiplication(100, 100));
        System.out.println(getDivision(200, 50));
        System.out.println(getDivision(1000, 3));
        System.out.println(getModularDivision(10, 5));
        System.out.println(getPower(10, 2));
        System.out.println(getPower(300, 3));
        System.out.println(getPercentage(200, 20));
        System.out.println(getPercentage(5000, 35));
        System.out.println(getFactorial(5));
        System.out.println(getFactorial(20));
        System.out.println(getSquareRoot(25));
    }

    static int getSum(int number1, int number2) {
        return number1 + number2;
    }

    static int getSubtraction(int number1, int number2) {
        return number1 - number2;
    }

    static int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    static int getDivision(int num1, int num2) {
        return num1 / num2;
    }

    static int getModularDivision(int num1, int num2) {
        return num1 % num2;
    }

    static double getPower(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    static int getPercentage(int num1, int num2) {
        return num1 * num2 / 100;
    }

    static long getFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static double getSquareRoot(int number) {
        return Math.sqrt(number);
    }
}
