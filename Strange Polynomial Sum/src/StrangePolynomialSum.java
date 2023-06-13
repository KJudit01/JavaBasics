import java.util.Scanner;

public class StrangePolynomialSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 1) {
            System.err.println("Invalid number! Exit the program");
            System.exit(0);
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 11 == 0) {
                int exponent = (i / 11) + 1;
                sum += Math.pow(i, exponent);
            }
        }
        System.out.println("The sum of the strange polynomal is " + sum);
        scan.close();

    }
}
