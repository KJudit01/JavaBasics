import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isValidNum = false;
        int num = 0;
        int attempt = 0;
        String[] digit = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",};
        String[] teens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String hundred = sc.nextLine();
        if (num > 1 && num < 999) {
            System.out.println("Please give me a number between 1 and 999: ");
            for (int i = 1; i < num; i++) {
                if (num <= 19) {
                    System.out.println("The number is: " + digit[i]);
                } else if (num >= 20 && num <= 99) {
                    System.out.println("The number is: " + teens[i] + " - " + digit[i]);
                } else {
                    System.out.println("The number is: " + digit[i] + " " + hundred + " and " + teens[i] + " - " + digit[i]);
                }
            }
        } else if (attempt < 3) {
        } else {
            System.err.println("I'm sorry. Too many attempts.");
            System.exit(0);

        }
        sc.close();
    }
}

