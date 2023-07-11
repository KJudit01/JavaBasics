import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SquareNumberLister {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        int number = 0;
        while (attempt < 5) {
            try {
                System.out.print("Give me a number: ");
                number = scanner.nextInt();
                squareNumber(number);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Try again.");
                scanner.nextLine();
                attempt++;
            }
        }
        if (attempt == 5) {
            System.err.println("Exiting ...");
        }
        scanner.close();
    }

    public static void squareNumber(int number) {
        for (int i = 0; i <= number; i++) {
            if (number >= 2 && number <= 2_000_000_000)
                System.out.println(i * i);
        }
    }
}
