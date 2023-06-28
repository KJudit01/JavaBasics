import java.util.Scanner;

public class HeavenlyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me a number!");
        System.out.print("The number is: ");
        int number = sc.nextInt();
        boolean isHeavenly = false;

        if (number < 100 && number % 2 == 0 && number % 7 != 0) {
            isHeavenly = true;
        }
        if (number > 300 && number % 13 == 0 && countDivisor(number) > 8) {
            isHeavenly = true;
        }
        if (isHeavenly) {
            System.out.println("The given number is heavenly.");
        } else {
            System.out.println("The given number is not heavenly.");
        }
        System.out.println("The divisor is " + countDivisor(number));
        sc.close();

    }

    public static int countDivisor(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
