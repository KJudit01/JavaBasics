import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        int lowerBound = 1000;
        int upperBound = 2073;
        int primeCount = countPrimes(lowerBound, upperBound);

        System.out.println("The number of primes between " + lowerBound + " and " + upperBound + " is: " + primeCount);

        System.out.println("All the primes in the given range:");
        printPrimes(lowerBound, upperBound);
    }
    public static int countPrimes(int lowerBound, int upperBound) {
        int count = 0;
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printPrimes(int lowerBound, int upperBound) {
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }
}

