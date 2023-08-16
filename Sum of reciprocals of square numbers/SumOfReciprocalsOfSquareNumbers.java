import java.util.Scanner;

public class SumOfReciprocalsOfSquareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Please give me a number: ");
        int counter = 0;
        do {
            number = scanner.nextInt();
            if (!isValid(number)) {
                counter++;
                if (counter < 3) {
                    System.out.println("Please give me a proper number!");
                } else if (counter < 6) {
                    System.out.println("Please give me an integer!");
                } else if (counter < 10) {
                    System.out.println("Please give me an integer between 5 and 15000! For instance, 4 is an invalid number but 7 is a valid one. :)");
                } else {
                    System.err.println("Invalid input! Bye!");
                    System.exit(0);
                }
            }
        } while (!isValid(number));
        System.out.println("The reciprocal of square numbers between 1 and the number is: " + getReciprocalOfSquareNumbers(number));
        double infiniteReciprocalSum = calculateInfiniteReciprocalSum();
        System.out.println("The infinite of the reciprocal sum is: " + infiniteReciprocalSum);
        double difference = Math.abs(calculateInfiniteReciprocalSum() - getReciprocalOfSquareNumbers(number));
        System.out.println("The difference is: " + difference);
        if (difference <= 0.0001) {
            System.out.println("Easter Egg: The result is close to the real one!");
        } else if (difference >= 1.0) {
            System.out.println("Easter Egg: The result is far from the real one!");
        }

        System.out.println("Thanks and goodbye!");

        System.out.println("The numbers between the value you provided and 0 that are divisible by 2000.:");
        for (int i = number; i >= 0; i--) {
            if (i % 2000 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static double calculateInfiniteReciprocalSum() {
        return Math.pow(Math.PI, 2) / 6;
    }

    private static double getReciprocalOfSquareNumbers(int number) {
        double sumOfReciproc = 0.0;
        for (int i = 1; i <= number; i++) {
            sumOfReciproc += 1 / (i * i);
        }
        return sumOfReciproc;
    }

    public static boolean isValid(int number) {
        return number >= 5 && number <= 15000;
    }
}
