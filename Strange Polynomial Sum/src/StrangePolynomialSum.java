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

            for (int i = 0; i < n; i++) {
                System.out.printf("Calculating %d^%d and adding it to %d%n ", i + 1, index, sum);
                sum += Math.pow(i + 1, index);
                index++;

                switch (index) {
                    case 5 -> index = 1;
                }
            }
            System.out.println("The sum of the strange polynomial is " + sum);
            scan.close();
        }


    }
}




