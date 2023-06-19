import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        boolean isInputValid = false;
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number >= 2 && number <= 55) {
                    isInputValid = true;
                } else {
                    System.err.println("Wrong number! Give me a greater number than 2.");
                }
            } else {
                sc.next();
                System.err.println("Wrong number! Give me a greater number than 2.");
                break;
            }
        } while (!isInputValid);
        System.out.println("The number is " + number);
        int incorrectInput = 0;
        if (incorrectInput > 5) {
            System.err.println("Invalid number!");
        } else {
            System.out.println("The multiplication table from " + number);
        }

        String separator = "-------------------------";
        for (int i = 1; i <= 10; i++) {
            System.out.println();
            int result = 0;
            result = number * i;
            if (result < number) {
                System.out.println(result + " " + "\n" + separator);
            } else {
                System.out.println(result + " " + "\n" + separator);
            }
        }
        sc.close();
    }
}
