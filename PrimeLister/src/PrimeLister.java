import java.util.Scanner;

public class PrimeLister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int invalidInputCounter = 0;
        while (invalidInputCounter < 5) {
            System.out.println("Please give me a number between 2 and 2_000_000_000.");
            String input = sc.nextLine();
            if (isValidNumber(input)) {
                int number = Integer.parseInt(input);
                if (number >= 2 && number <= 2_000_000_000) {
                    System.out.println("Prime numbers between 1 and " + number + " :");
                    listPrimes(number);
                    break;
                } else {
                    System.out.println("Invalid input!");
                    invalidInputCounter++;
                }
            } else {
                System.out.println("Invalid input!");
                invalidInputCounter++;
            }
        }
        if (invalidInputCounter == 5) {
            System.out.println("Too many invalid input! Exiting the application.");
        }
        sc.close();
    }

    public static boolean isValidNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void listPrimes(int number) {
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
            }
            return false;
        }
        return true;
    }
}
