public class PrimeCounter {
    public static void main(String[] args) {
        System.out.println(countPrimes());
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes() {
        int count = 0;
        for (int i = 1000; i <= 2073; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
}
