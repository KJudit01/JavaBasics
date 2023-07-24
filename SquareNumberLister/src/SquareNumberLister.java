import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SquareNumberLister {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int invalidInputCount = 0;
        int maxInvalidInputAttempts = 5;
        while (invalidInputCount < maxInvalidInputAttempts) {
            System.out.print("Please give me a number between 2 and 2_000_000_000: ");
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (isValidNumber(number)) {
                    listSquareNumbers(number);
                    return;
                } else {
                    System.out.println("Invalid input!");
                    invalidInputCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
                invalidInputCount++;
            }
        }
        System.err.println("You have given invalid input five times. Exiting.. ");
        scanner.close();
    }

    private static boolean isValidNumber(int number) {
        return number >= 2 && number <= 2_000_000_000;
    }

    private static void listSquareNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i * i);
        }
    }
}

