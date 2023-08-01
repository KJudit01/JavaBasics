import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        do{
            for (int i = 0; i <= number ; i++) {
                int max = 2;
                if(number%i==0){
                    max = Integer.MIN_VALUE;
                    System.out.println(isValidNumber(max));
                }
            }

        }while (number >2);

    }
    public static boolean isValidNumber(int number){
        if(number >=2 && number <= 100000){
            return true;
        }
        return false;
    }
}
