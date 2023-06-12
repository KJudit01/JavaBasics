import java.util.Scanner;

public class StrangePolynomialSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        do {
            System.err.println("Invalid number! Exit the program");
            System.exit(0);
        } while (n < 1);
        int index = 1;
        int sum = 0;
        for (int i = 1; i < ; i++) {
            sum += sum + i;
            i++;
        }
        System.out.println("The sum of the strange polynomal is " + sum);
        scan.close();

    }
}
