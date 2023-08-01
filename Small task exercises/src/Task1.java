import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("How many primes are there between 1000 and 2073?");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int start = 1000;
        int end = 2073;
        //int counter = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                //counter++;
            }
        }
        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
