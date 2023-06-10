import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a positive cardinal number.");
        int number = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("The factorial of the number is " + factorial);
        scanner.close();
    }
}
