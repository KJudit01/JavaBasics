import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("What do you intend to do? Please choose a number between 1 and 9: ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Modular Division");
        System.out.println("6 - Power");
        System.out.println("7 - Percentage");
        System.out.println("8 - Factorial");
        System.out.println("9 - Square Root");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                performAddition(scanner);
                break;
            case 2:
                performSubtraction(scanner);
                break;
            case 3:
                performMultiplication(scanner);
                break;
            case 4:
                performDivision(scanner);
                break;
            case 5:
                performModularDivision(scanner);
                break;
            case 6:
                performPower(scanner);
                break;
            case 7:
                performPercentage(scanner);
                break;
            case 8:
                performFactorial(scanner);
                break;
            case 9:
                performSquareRoot(scanner);
                break;
        }
    }

    private static void performSquareRoot(Scanner scanner) {
        System.out.print("Please give me a number: ");
        int num = scanner.nextInt();
        System.out.println(getSquareRoot(num));
    }

    private static void performFactorial(Scanner scanner) {
        System.out.print("Please give me a number: ");
        int num = scanner.nextInt();
        System.out.println(getFactorial(num));
    }

    private static void performPercentage(Scanner scanner) {
        System.out.print("Please give me two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(getPercentage(num1, num2));
    }

    private static void performPower(Scanner scanner) {
        System.out.print("Please give me two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(getPower(num1, num2));
    }

    private static void performModularDivision(Scanner scanner) {
        System.out.print("Please give me two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(getModularDivision(num1, num2));
    }

    private static void performDivision(Scanner scanner) {
        System.out.print("Please give me two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(getDivision(num1, num2));
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.print("Please give me two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(getMultiplication(num1, num2));
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.print("Please give me two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(getSubtraction(number1, number2));
    }

    public static void performAddition(Scanner scanner) {
        System.out.print("Please give me two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(getSum(number1, number2));
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

    static double getDivision(double num1, double num2) {
        return num1 / num2;
    }

    static int getModularDivision(int num1, int num2) {
        return num1 % num2;
    }

    static double getPower(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    static double getPercentage(int num1, int num2) {
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
