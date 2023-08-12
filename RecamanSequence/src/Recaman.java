import java.util.Arrays;
import java.util.Scanner;

public class Recaman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a number and I'll give you the sequence: ");
        int length = scanner.nextInt();
        int[] recaman = new int[length];
        calculateReceman(recaman, length, 1);
        System.out.println(Arrays.toString(recaman));
    }

    public static void calculateReceman(int[] sequence, int length, int numberOfCalculatedElements) {
        if (numberOfCalculatedElements >= length) {
            return;
        }

        int temp = sequence[numberOfCalculatedElements - 1] - numberOfCalculatedElements;
        if (temp > 0 && !contains(sequence, temp)) {
            sequence[numberOfCalculatedElements] = temp;
        } else {
            sequence[numberOfCalculatedElements] = sequence[numberOfCalculatedElements - 1] + numberOfCalculatedElements;
        }

        calculateReceman(sequence, length, numberOfCalculatedElements + 1);
    }

    private static boolean contains(int[] sequence, int value) {
        for (int num : sequence) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}


