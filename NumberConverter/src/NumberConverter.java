import java.util.Scanner;

public class NumberConverter {
    private static final String[] UNITS = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static final String[] THOUSANDS = {
            "", "thousand", "million", "billion", "trillion"
    };
    private static final String HYPHEN = "-";
    private static final String LINKER = "and";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        long number = 0;

        while (attempts < 3) {
            System.out.print("Enter a number between 1 and 999,999,999,999,999: ");
            String input = scanner.nextLine();

            try {
                number = Long.parseLong(input);
                if (number >= 1 && number <= 999_999_999_999_999L) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 999,999,999,999,999.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

            attempts++;
        }

        if (attempts < 3) {
            String words = convertToWords(number);
            System.out.println("In words: " + words);
        } else {
            System.out.println("Bye!");
        }
        scanner.close();
    }

    static String convertToWords(long number) {
        String words = " ";
        int thousandsIndex = 0;

        while (number > 0) {
            if (number % 1000 != 0) {
                String chunkWords = convertChunkToWords((int) (number % 1000));
                if (!chunkWords.isEmpty() && !words.isEmpty()) {
                    words = chunkWords + " " + THOUSANDS[thousandsIndex] + " " + words;
                } else {
                    words = chunkWords + THOUSANDS[thousandsIndex] + " " + words;
                }
            }
            number /= 1000;
            thousandsIndex++;
        }
        return words.trim();
    }

    static String convertChunkToWords(int number) {
        if (number < 20) {
            return UNITS[number];
        }

        if (number < 100) {
            String result = TENS[number / 10];
            if (number % 10 != 0) {
                result += HYPHEN + UNITS[number % 10];
            }
            return result;
        }

        String result = UNITS[number / 100] + " hundred";
        if (number % 100 != 0) {
            result += LINKER + " " + convertChunkToWords(number % 100);
        }
        return result;
    }
}

