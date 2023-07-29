public class TipCalculator {
    public static void main(String[] args) {
        int[] prices = {2000, 250, 300, 50, 250};
        System.out.println(calculateTip(prices, 20));
        System.out.println(calculateTip(prices, 1));
    }

    static int calculateTip(int[] prices, int percentage) {
        int sum = getSum(prices);
        if (isValidNumber(percentage)) {
            return (sum * percentage) / 100;
        } else {
            return -1;
        }
    }

     static int getSum(int[] prices) {
        int sum = 0;
        for (int i = 0; i <= prices.length - 1; i++) {
            sum += prices[i];
        }
        return sum;
    }

    private static boolean isValidNumber(int number) {
        if (number >= 10 && number <= 80) {
            return true;
        } else {
            return false;
        }
    }
}
