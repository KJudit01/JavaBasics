import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ModeMedianPower {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 5, 6, 6, 6, 7, 8};

        int mode = getMode(array);
        int median = getMedian(array);

        int result = power(mode, median);
        System.out.println("The mode is the median of the power of the number is: " + result);
    }
    public static int getMode(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mode = 0;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) { //internet source
            int num = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }

        return mode;
    }
    public static int getMedian(int[] array) {
        Arrays.sort(array);

        if (array.length % 2 == 0) {
            int mid1 = array[array.length / 2 - 1];
            int mid2 = array[array.length / 2];
            return (mid1 + mid2) / 2;
        } else {
            return array[array.length / 2];
        }
    }
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}


