import java.util.Scanner;

public class StrangePolynomialSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 1) {
            System.err.println("Invalid number! Exit the program");
            System.exit(0);
        }else {
            int sum = 0;
            int index = 1;

            for (int i = 1; i < n; i++) {
                sum += Math.pow(n, index);
                index++;
            }
            if (index > 4) {
                index = 1;
            }
            System.out.println("The sum of the strange polynomal is " + sum);
            scan.close();
        }
    }
}




