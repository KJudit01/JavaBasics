import java.util.Scanner;

public class SquareNumberLister {
    public static void main(String[] args) {
        int invalidInputCount = 0;
        int maxInvalidInputCount = 5;
        int number = 0;
        while (invalidInputCount < maxInvalidInputCount) {
            number = readNumber();
            if (number >= 2 && number <= 2_000_000_000) {
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }
        if (invalidInputCount == maxInvalidInputCount) {
            System.out.println("You've reached the max invalid input! Exiting the application.");
            System.exit(0);
        }
        System.out.println("Prime numbers between 1 and " + number + " : ");
        listPrimes(number);
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public static void listPrimes(int number) {
        boolean[] isComposite = new boolean[number + 1];
        for (int i = 2; i * i < number; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= number; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        for (int i = 2; i <= number; i++) {
            if (!isComposite[i]) {
                System.out.println(i);
            }
        }
    }


}
