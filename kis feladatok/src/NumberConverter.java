import java.util.Scanner;

public class NumberConverter { //az órai feladat szerint próbálkoztam még, de ezt nem fejeztem be
                                // a thousand változót nem engedi inicializálni, nem tudom miért

        private static final String[] ONE_TO_NINETEEN = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        private static final String[] TWENTY_TO_NINETY = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        private static final String HUNDRED = "hundred";
        private static final String thousand = "thousand";
        private static final String HYPHEN = "-";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please give a number: ");
            int number = scanner.nextInt();
            String numberInEnglish = "";
            if (number > 100) {
                int hundreds = number / 100;
                numberInEnglish += ONE_TO_NINETEEN[hundreds] + " " + HUNDRED;
                number -= hundreds * 100;
            }
            if(number >= 1000){
                int thousands = number / 1000;
                int hundreds = number / 100;
                numberInEnglish += ONE_TO_NINETEEN[thousands] + "thousand" + ONE_TO_NINETEEN[hundreds] + TWENTY_TO_NINETY[number/10] + HYPHEN + ONE_TO_NINETEEN[number/10];
            }
            if (number >= 20) {
                numberInEnglish += " " + TWENTY_TO_NINETY[number / 10];
                number %= 10;
                numberInEnglish += HYPHEN + ONE_TO_NINETEEN[number];
            } else {
                numberInEnglish += " " + ONE_TO_NINETEEN[number];
            }
            System.out.println(numberInEnglish);
            scanner.close();
        }
    }

