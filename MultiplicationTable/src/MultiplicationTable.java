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
        for (int i = 1; i <= 55; i++) {
            for (int j = 1; j <55; j++) {
                System.out.printf("%5d ",i*j);
            }
            System.out.println();
        }
        sc.close();
    }
}
