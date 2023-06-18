import java.util.Scanner;

public class StrangePolynomialSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 1) {
            System.err.println("Invalid number! Exit the program");
            System.exit(0);
        } else {
            long sum = 0;
            int index = 1;

            for (int i = 1; i < n; i++) {
                sum += Math.pow(i + 1, index);
                index++;

                switch (index) {
                    case 4 -> index = 1;

                    default -> index++;
                }
            }
            System.out.println("The sum of the strange polynomial is " + sum);
            scan.close();
        }
    }
}




