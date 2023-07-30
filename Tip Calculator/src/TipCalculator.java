public class TipCalculator {
    public static void main(String[] args) {
        int[] prices = {2000, 250, 300, 50, 250};
        System.out.println(calculateTip(prices, 20));
        System.out.println(calculateTip(prices, 1));
        System.out.println(calculateTip(prices, 10));
        System.out.println(calculateTip(prices, 80));
        System.out.println(calculateTip(prices, 16));
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
        for (int element : prices) {
            sum += element;
        }
        return sum;
    }

    static boolean isValidNumber(int number) {
        if (number >= 10 && number <= 80) {
            return true;
        }
        return false;
    }
}
