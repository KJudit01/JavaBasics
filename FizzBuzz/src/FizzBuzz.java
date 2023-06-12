import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        do {
            System.out.println("Invalid number! Enter a positive number!");
            number++;
        } while (!scan.hasNextInt());
        int newNumber = scan.nextInt();
        for (int i = 0; i < newNumber + 1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("The input is valid: " + newNumber + "\n" + "FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
