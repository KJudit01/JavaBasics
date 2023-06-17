import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isInputValid = false;
        int number = 0;
        do{
            if(scan.hasNextInt()){
                number = scan.nextInt();
                if(number > 1){
                    isInputValid = true;
                }else {
                    System.err.println("Please enter a positive cardinal number.");
                }
            }else {
                scan.next();
                System.err.println("Please enter a positive cardinal number.");
            }
        }while (!isInputValid);
        System.out.println("The given number is " + number);
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
