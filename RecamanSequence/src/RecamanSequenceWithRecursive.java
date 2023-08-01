public class RecamanSequenceWithRecursive {
    public static void generateRecamanSequence(int n) {
        int[] sequence = new int[n];
        generateRecamanSequenceRecursive(sequence, n - 1);
    }

    private static void generateRecamanSequenceRecursive(int[] sequence, int i) {
        if (i == 0) {
            sequence[i] = 0;
        } else {
            int prev = sequence[i - 1];
            int temp = prev - i;
            if (temp >= 0 && !contains(sequence, temp)) {
                sequence[i] = temp;
            } else {
                sequence[i] = prev + i;
            }
        }

        System.out.print(sequence[i] + " ");

        if (i > 0) {
            generateRecamanSequenceRecursive(sequence, i - 1);
        }
    }

    private static boolean contains(int[] sequence, int value) {
        for (int num : sequence) {
            if (num == value) {
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
