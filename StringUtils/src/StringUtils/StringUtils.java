package StringUtils;

import java.util.Scanner;

public class StringUtils {
    public static void main(String[] args) {
        //1. Bekérek egy stringet és megszámolom, hogy hány y-karakter van benne
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give me a text: ");
        String text = scanner.nextLine();
        int counter = countYChar(text);
        System.out.println("There are " + counter + " 'y'-character in the text.");
        //2. bekérsz egy stringet és egy karaktert és megszámolja és megszámolja, hogy a karakter hányszol szerepel a stringben
        System.out.print("Please give me a character please: ");
        char character = scanner.next().charAt(0);
        int count = countCharacterInString(text, character);
        System.out.println(character + " is in the text " + count + " times.");
        //3. bekérsz egy stringet és egy számot, és visszatér a string számszor ismételt  verziójával
        //pl. hello, 3 ---> hellohellohello
        int number = scanner.nextInt();
        isStringSimilar(text, text);
        repeatText("hello", 3);
        System.out.println(repeatText("hello", 3));
        //4. bevesz két stringet, és megnézi, hogy  egyenlőek e az equals használata nélkül
        //5. bevesz egy stringet és megállapítja, hogy valid bankszámlaszám e. (valid: 16 vagy 24 karakternyi szám)
        //6. bevesz egy stringet és megállapítja, hogy valid régi típusú rendszámtáblaszám e. validnak számít a 3 nagybetű karakter,
        // utána kötőjel és utána 3 számjegy
        scanner.close();
    }
    static boolean isValidBankAccount(String string){
        if(string.length() != 16 && string.length() != 24){
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            int number = string.charAt(i) - '0';
            if(number >= 0 || number <= 9){
                return false;
            }
        }
        return true;
    }

    static boolean isStringSimilar(String textOne, String textTwo) {
        int length1 = textOne.length();
        int length2 = textTwo.length();
        if (textOne == null && textTwo == null) {
            return true;
        } else if (textOne == null || textTwo == null) {
            return false;
        }
        if (length1 != length2) {
            return false;
        }
        for (int i = 0; i < length1; i++) {
            char character1 = textOne.charAt(i);
            char character2 = textTwo.charAt(i);
            if (Character.isLowerCase(character1) != Character.isLowerCase(character2)) {
                return false;
            }
        }
        return true;
    }

    static String repeatText(String text, int numberTimes) {
        StringBuilder result = new StringBuilder();
        for (int n = 0; n < numberTimes; n++) {
            result.append(text);
        }
        return result.toString();
    }

    static int countCharacterInString(String text, char character) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                counter++;
            }
        }
        return counter;
    }

    static int countYChar(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'y') {
                count++;
            }
        }
        return count;
    }
}
