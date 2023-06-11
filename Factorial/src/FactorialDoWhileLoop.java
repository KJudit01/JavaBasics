import java.util.Scanner;

public class FactorialDoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me a positive cardinal number.");
        int number = scan.nextInt();
        long factorial = 1;
        int i = 1;
        do{
            factorial *= i;
            i++;
        }while (i <= number);
        System.out.println("The factorial of the number with do-while loop is: " + factorial);
        scan.close();
    }
}
