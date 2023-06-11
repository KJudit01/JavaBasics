import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a positive cardinal number.");
        int number = scan.nextInt();
        long factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of the number with while loop is: " + factorial);
        scan.close();
    }
}
