import java.util.Arrays;

public class ModusMedianPower {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 6, 7, 8};
        double median = getMedian(array);
        int modus = getModus(array);
      //  int result = power(modus, (int) median);
       // System.out.println(result);
    }

    private static int getModus(int[] array) { ////?????????
        int maxfrequency = 0;
        int mode = 0;
        if(maxfrequency > mode){
            maxfrequency = mode;
        }
        return mode;
    }

    private static double getMedian(int[] array) {
        Arrays.sort(array);
        if (array.length % 2 == 0){
        double mid1 = array.length/2.;
        int mid2 = array.length/2-1;
        return mid1+mid2/2.;
        }else{
            return array[array.length/2];
        }
    }
    public static double power(int base, double exponent){
        return Math.pow(base,exponent);
    }
}
