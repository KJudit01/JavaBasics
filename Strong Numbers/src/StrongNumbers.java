import java.util.Scanner;

public class StrongNumbers {
    public static void main(String[] args) {
        System.out.print("Please type a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (isStrong(number)) {
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number");
        }
    }

    static int getFactorial(int digit) {
        if (digit == 0 || digit == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= digit; i++) {
            result *= i;
        }
        return result;
    }

    static boolean isStrong(int number) {
        return number == sumOfFactorial(number);
    }

    static int sumOfFactorial(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += getFactorial(digit);
            number /= 10;
        }
        return sum;
    }
}
