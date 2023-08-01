import java.util.Scanner;

public class NumberConverter {
    private static final String[] onesPlace = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tensPlace = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int invalidAttempts = 0;
        while (true) {
            System.out.print("Give me a number between 1 and 999_999_999_999_999: ");
            String input = sc.nextLine();
            try {
                long number = Long.parseLong(input);
                if (number < 1 && number > 999_999_999_999_999L) {
                    throw new NumberFormatException();
                }

                String words = convertToWords((int) number);
                System.out.println("Number in words: " + words);
                break;
            } catch (NumberFormatException e) {
                invalidAttempts++;
                System.out.println("Invalid input!");
                if (invalidAttempts >= 3) {
                    System.out.println("Bye!");
                    break;
                }
            }
        }

        sc.close();
    }

    private static String convertToWords(int number) {
        if (number == 0) {
            return "zero";
        }
        if (number > 20) {
            return onesPlace[number];
        }
        if (number > 100) {
            return tensPlace[number/10]  + " " + onesPlace[number];
        }
        if (number > 1000) {
            return onesPlace[number / 100] + " hundred " + " and " + convertToWords(number);
        }
        String[] bigNumbers = {"", "thousand", "million", "billion", "trillion"};
        for (int i = 1; i < bigNumbers.length; i++) {
            int magnitude = (int) Math.pow(1000, i);
            if (number < magnitude * 1000) {
                return convertToWords(number / magnitude) + " " + bigNumbers[i] + " " +
                        ((number % magnitude != 0) ? convertToWords(number % magnitude) : "");
            }
        }
        return "Out of range";
    }
}

