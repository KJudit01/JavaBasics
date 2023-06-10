import java.util.Scanner;

public class SumOfSquareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number!");
        int number = scanner.nextInt();
        if(number < 0 || number > 500){
            System.out.println("Wrong number! Try again.");
        }
        int sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i * i;
        }
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
