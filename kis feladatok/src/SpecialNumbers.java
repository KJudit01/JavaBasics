public class SpecialNumbers {
    public static void main(String[] args) {
        int lowerBound = 15003;
        int upperBound = 1416221;

        for (int num = lowerBound; num <= upperBound; num += 5) {
            if (num % 10 != 0 && num % 3 != 0 && countDivisors(num) <= 12 && num > factorial(8)) {
                System.out.println(num);
            }
        }
    }
    public static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
