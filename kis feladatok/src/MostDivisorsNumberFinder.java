import java.util.Scanner;

    public class MostDivisorsNumberFinder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please give me a number between 2 and 100000: ");
            int number = scanner.nextInt();

            if (number < 2 || number > 100000) {
                System.out.println("Invalid input!.");
                System.exit(1);
            }
            int numberWithMostDivisors = findNumberWithMostDivisors(number);
            System.out.println("The most divisor number is: " + numberWithMostDivisors);
        }
        public static int findNumberWithMostDivisors(int n) {
            int numberWithMostDivisors = 1;
            int maxDivisors = 1;

            for (int num = 2; num <= n; num++) {
                int divisorCount = countDivisors(num);
                if (divisorCount > maxDivisors) {
                    maxDivisors = divisorCount;
                    numberWithMostDivisors = num;
                }
            }
            return numberWithMostDivisors;
        }
        public static int countDivisors(int num) {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            return count;
        }
    }


