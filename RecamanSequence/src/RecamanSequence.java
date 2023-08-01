public class RecamanSequence {
    public static void generateRecamanSequence(int n) {
        int[] sequence = new int[n];
        sequence[0] = 0;
        System.out.print(sequence[0] + " ");

        for (int i = 1; i < n; i++) {
            int prev = sequence[i - 1];
            int temp = prev - i;
            if (temp >= 0 && !contains(sequence, temp, i)) {
                sequence[i] = temp;
            } else {
                sequence[i] = prev + i;
            }
            System.out.print(sequence[i] + " ");
        }
    }

    private static boolean contains(int[] sequence, int value, int endIndex) {
        for (int i = 0; i < endIndex; i++) {
            if (sequence[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Recamán's sequence:");
        generateRecamanSequence(n);
    }
}

