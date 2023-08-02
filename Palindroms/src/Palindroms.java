import java.util.Scanner;

public class Palindroms {
    public static void main(String[] args) {
        System.out.println("May I ask your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Let me welcome you " + name + " !");
        if(name.length() < 3 || name.length() < 15){
            System.out.println("Invalid word. Type another please.");
        }else{
            System.out.println();
        }

    }
}
